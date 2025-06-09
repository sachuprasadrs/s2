SET SERVER OUTPUT ON
SET VERIFY OFF

DECLARE
    str_input VARCHAR2(100);
    reversed_str VARCHAR2(100) := '';
BEGIN
    str_input := '&str';

    FOR i IN REVERSE 1 .. LENGTH(str_input) LOOP
        reversed_str := reversed_str || SUBSTR(str_input, i, 1);
    END LOOP;

    IF str_input = reversed_str THEN
        DBMS_OUTPUT.PUT_LINE(str_input || ' is a palindrome.');
    ELSE
        DBMS_OUTPUT.PUT_LINE(str_input || ' is not a palindrome.');
    END IF;
END;
/
