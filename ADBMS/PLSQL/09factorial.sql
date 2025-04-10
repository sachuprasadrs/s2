DECLARE
    num INTEGER;
    fact INTEGER := 1;
BEGIN
    num := &num;
    FOR i IN 1..num LOOP
        fact := fact * i;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Factorial of ' || num || ' is ' || fact);
END;
/
