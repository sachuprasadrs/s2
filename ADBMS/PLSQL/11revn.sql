DECLARE
    num INTEGER;
    rev INTEGER := 0;
    remainder INTEGER;
BEGIN
    num := &num;
    WHILE num > 0 LOOP
        remainder := num MOD 10;
        rev := rev * 10 + remainder;
        num := num / 10;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Reversed number is ' || rev);
END;
/
