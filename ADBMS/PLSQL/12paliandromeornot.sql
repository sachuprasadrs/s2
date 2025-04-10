DECLARE
    num INTEGER;
    original_num INTEGER;
    rev INTEGER := 0;
    remainder INTEGER;
BEGIN
    num := &num;
    original_num := num;
    WHILE num > 0 LOOP
        remainder := num MOD 10;
        rev := rev * 10 + remainder;
        num := num / 10;
    END LOOP;
    IF original_num = rev THEN
        DBMS_OUTPUT.PUT_LINE(original_num || ' is a palindrome.');
    ELSE
        DBMS_OUTPUT.PUT_LINE(original_num || ' is not a palindrome.');
    END IF;
END;
/

