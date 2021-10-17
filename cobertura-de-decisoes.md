## Cobertura de decisões para os testes do NewLineSeparator

| ID | Condição | Situação para True | Situação para False |
| :-: | :--: | :--: | :--: | 
| 1 | NewLineSeparator == **CR** | NewLineSeparator = **CR** | NewLineSeparator = **LF** ou NewLineSeparator = **CRLF** |
| 2 | NewLineSeparator == **LF** | NewLineSeparator = **LF** | NewLineSeparator = **CR** ou NewLineSeparator = **CRLF** | 
| 3 | NewLineSeparator == **CRLF** | NewLineSeparator = **CRLF** | NewLineSeparator = **CR** ou NewLineSeparator = **LF** |
| 4 | NewLineSeparator.getDisplayName = "CR (\"\\r\")" | NewLineSeparator = **CR** | NewLineSeparator = **LF** ou NewLineSeparator = **CRLF** |
| 5 | NewLineSeparator.getDisplayName = "LF (\"\\n\")" | NewLineSeparator = **LF** | NewLineSeparator = **CR** ou NewLineSeparator = **CRLF** | 
| 6 | NewLineSeparator.getDisplayName = "CR/LF (\"\\r\\n\")" | NewLineSeparator = **CRLF** | NewLineSeparator = **CR** ou NewLineSeparator = **LF** | 
| 7 | NewLineSeparator.toString = "\r" | NewLineSeparator = **CR** | NewLineSeparator = **LF** ou NewLineSeparator = **CRLF** |
| 8 | NewLineSeparator.toString = "\n" | NewLineSeparator = **LF** | NewLineSeparator = **CR** ou NewLineSeparator = **CRLF** | 
| 9 | NewLineSeparator.toString = "\r\n" | NewLineSeparator = **CRLF** | NewLineSeparator = **CR** ou NewLineSeparator = **LF** |
| 10 | NewLineSeparator.parse(str) = **CR** | str = "\r" | str = "\n" ou str = "\r\n" |
| 11 | NewLineSeparator.parse(str) = **LF** | str = "\n" | str = "\r" ou str = "\r\n" | 
| 12 | NewLineSeparator.parse(str) = **CRLF** | str = "\r\n" | str = "\r" ou str = "\n" | 