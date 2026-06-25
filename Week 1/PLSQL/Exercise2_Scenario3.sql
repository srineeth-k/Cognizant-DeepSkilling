DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN fromAccount INT,
    IN toAccount INT,
    IN transferAmount DECIMAL(10,2)
)
BEGIN

    DECLARE sourceBalance DECIMAL(10,2);

    SELECT Balance
    INTO sourceBalance
    FROM Accounts
    WHERE AccountID = fromAccount;

    IF sourceBalance >= transferAmount THEN

        UPDATE Accounts
        SET Balance = Balance - transferAmount
        WHERE AccountID = fromAccount;

        UPDATE Accounts
        SET Balance = Balance + transferAmount
        WHERE AccountID = toAccount;

        SELECT 'Transfer Successful' AS Message;

    ELSE

        SELECT 'Insufficient Balance' AS Message;

    END IF;

END $$

DELIMITER ;