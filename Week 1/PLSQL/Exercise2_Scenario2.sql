DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept_name VARCHAR(50),
    IN bonus_percent DECIMAL(5,2)
)
BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE Department = dept_name;

END $$

DELIMITER ;