# Задание

Проанализируйте метод nextlnt () из класса Scanner. Является ли он методом доступа или модифицирующим методом и почему?
А что можно сказать о методе nextlnt () из класса Random?

# Определение из учебника
Если метод изменяет объект, для которого он вызывается, то такой метод называется модифицирующим.
А если вызываемый метод оставляет объект без изменения, то он называется методом доступа.

# Ответы на поставленный вопрос

1) Собственно, из javadoc:\
`Сканирует следующий токен ввода как int. Этот метод будет генерировать InputMismatchException, если следующий токен
не может быть переведен в допустимое значение int. Если перевод выполнен успешно,сканер продвигается мимо ввода.`\
Соответственно, из определения следует, что NextInt() является модифицирующим методом.

```
    public int nextInt(int radix) {
        // Check cached result
        if ((typeCache != null) && (typeCache instanceof Integer)
            && this.radix == radix) {
            int val = ((Integer)typeCache).intValue();
            useTypeCache();
            return val;
        }
        setRadix(radix);
        clearCaches();
        // Search for next int
        try {
            String s = next(integerPattern());
            if (matcher.group(SIMPLE_GROUP_INDEX) == null)
                s = processIntegerToken(s);
            return Integer.parseInt(s, radix);
        } catch (NumberFormatException nfe) {
            position = matcher.start(); // don't skip bad token <-----------------------------------
            throw new InputMismatchException(nfe.getMessage());
        }
    }
```

2) Из определения следует, что метод nextlnt () из класса Random является методом доступа, так как объект остается без изменений.
```
       public int nextInt(int bound) {
           if (bound <= 0)
               throw new IllegalArgumentException(BadBound);
           int r = next(31);
           int m = bound - 1;
           if ((bound & m) == 0)  // i.e., bound is a power of 2
               r = (int)((bound * (long)r) >> 31);
           else {
               for (int u = r;
                    u - (r = u % bound) + m < 0;
                    u = next(31));
           }
           return r;
       }
```
    