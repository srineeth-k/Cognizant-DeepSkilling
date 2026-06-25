DELIMITER $$

CREATE PROCEDURE LoanReminder()
BEGIN

    DECLARE done INT DEFAULT FALSE;
    DECLARE cust_name VARCHAR(100);
    DECLARE due_date DATE;

    DECLARE cur CURSOR FOR

        SELECT c.Name, l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY);

    DECLARE CONTINUE HANDLER FOR NOT FOUND
        SET done = TRUE;

    OPEN cur;

    read_loop: LOOP

        FETCH cur INTO cust_name, due_date;

        IF done THEN
            LEAVE read_loop;
        END IF;

        SELECT CONCAT(
            'Reminder: Dear ',
            cust_name,
            ', your loan is due on ',
            due_date
        ) AS Reminder;

    END LOOP;

    CLOSE cur;

END $$

DELIMITER ;