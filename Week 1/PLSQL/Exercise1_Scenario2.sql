DELIMITER $$

CREATE PROCEDURE UpdateVIPStatus()
BEGIN

    DECLARE done INT DEFAULT FALSE;
    DECLARE cust_id INT;
    DECLARE bal DECIMAL(10,2);

    DECLARE cur CURSOR FOR
        SELECT CustomerID, Balance
        FROM Customers;

    DECLARE CONTINUE HANDLER FOR NOT FOUND
        SET done = TRUE;

    OPEN cur;

    read_loop: LOOP

        FETCH cur INTO cust_id, bal;

        IF done THEN
            LEAVE read_loop;
        END IF;

        IF bal > 10000 THEN

            UPDATE Customers
            SET IsVIP = TRUE
            WHERE CustomerID = cust_id;

        END IF;

    END LOOP;

    CLOSE cur;

END $$

DELIMITER ;