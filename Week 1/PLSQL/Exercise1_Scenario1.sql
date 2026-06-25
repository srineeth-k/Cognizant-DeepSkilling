DELIMITER $$

CREATE PROCEDURE ApplySeniorDiscount()
BEGIN

    DECLARE done INT DEFAULT FALSE;
    DECLARE cust_id INT;
    DECLARE birth DATE;
    DECLARE age_years INT;

    DECLARE cur CURSOR FOR
        SELECT CustomerID, DOB
        FROM Customers;

    DECLARE CONTINUE HANDLER FOR NOT FOUND
        SET done = TRUE;

    OPEN cur;

    read_loop: LOOP

        FETCH cur INTO cust_id, birth;

        IF done THEN
            LEAVE read_loop;
        END IF;

        SET age_years = TIMESTAMPDIFF(YEAR, birth, CURDATE());

        IF age_years > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_id;

        END IF;

    END LOOP;

    CLOSE cur;

END $$

DELIMITER ;