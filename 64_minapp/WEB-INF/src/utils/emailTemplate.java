package utils;

public class emailTemplate {
    public static String getWLCmail(String name,String email,String verificationCode){
    


       return "<!DOCTYPE html>\r\n" + //
                        "<html lang=\"en\">\r\n" + //
                        "<head>\r\n" + //
                        "    <meta charset=\"UTF-8\">\r\n" + //
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                        "    <title>Document</title>\r\n" + //
                        "\r\n" + //
                        "    <style>\r\n" + //
                        "        body {\r\n" + //
                        "            margin: 0px auto;\r\n" + //
                        "            font-family: verdana;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        #container {\r\n" + //
                        "            width: 90%;\r\n" + //
                        "            margin: 0px auto;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        #header {\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            padding: 5px;\r\n" + //
                        "            margin-bottom: 10px;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        #menu {\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            padding: 5px;\r\n" + //
                        "            margin-bottom: 10px;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        #main_body {\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            padding: 5px;\r\n" + //
                        "            margin-bottom: 10px;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        #footer {\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            padding: 5px;\r\n" + //
                        "            margin-bottom: 10px;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        #text {\r\n" + //
                        "            border: 1px solid #ccc;\r\n" + //
                        "            padding: 10px;\r\n" + //
                        "            border-radius: 9px;\r\n" + //
                        "            width: 90%;\r\n" + //
                        "            margin: 20px auto;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        li {\r\n" + //
                        "            list-style: none;\r\n" + //
                        "            display: inline;\r\n" + //
                        "            margin-right: 10px;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        li a {\r\n" + //
                        "            text-decoration: none;\r\n" + //
                        "            border: 1px solid #eee;\r\n" + //
                        "            padding: 5px 12px;\r\n" + //
                        "            font-family: verdana;\r\n" + //
                        "        }\r\n" + //
                        "\r\n" + //
                        "        #logo_text {\r\n" + //
                        "            display: inline-block;\r\n" + //
                        "        }\r\n" + //
                        "    </style>\r\n" + //
                        "</head>\r\n" + //
                        "<body>\r\n" + //
                        "    <div id=\"container\">\r\n" + //
                        "        <div id=\"header\">\r\n" + //
                        "            <img height=\"60\" src=\"data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxASEhUSExASExUSFRYVFRUXFxcVGRYVFxUYFhYZFRcYHSggHRomHhUWITEhJSkrLi4uGB81ODMsNygtLi0BCgoKDg0OGxAQGy8lICUuLS0vMystLS0tLS0tLS0tLS0tLS0tLS0vLS0tLSstLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIAOEA4QMBEQACEQEDEQH/xAAcAAEAAgMBAQEAAAAAAAAAAAAABAUDBgcCAQj/xABAEAABAwICBwQIBAUCBwAAAAABAAIDBBEhMQUGEkFRYYEicZGhBxMyQlKxwdEUI2KCQ3KS4fAzohUlU7LD0vH/xAAbAQEAAgMBAQAAAAAAAAAAAAAAAwQBAgUGB//EADURAQACAQIDBAkEAgIDAQAAAAABAgMEERIhMQUTQVEiMmFxgZGhsdFCweHwBhRDUiMzYhX/2gAMAwEAAhEDEQA/AO4oCAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgqdK6yUdPhLOwOHuDtv6tbcjqp8Wmy5fVr+FjFpcuX1a/hq1f6TIxhDTPfzkcGDvAbtE+Sv4+yrT69tvdz/C/j7JtPr2293P8ACrbr1pGZ2zEyFpOTWsdI+38oJce/ZU06DTY43vM/b+/NNOg0+ON7TPziP781zRU2nZcX1IhHOOIX7uySOoCrXvo6+rTf4yq3vo6dK7/GWxUOi6luMlfM88NiADx9VdU75cc+rSI+f5U75cc+rSI+f5WzBYZk8zb6KBA9ICAgICAgICAgICAgICAgICAgICAg1vWLXOlpLsv62Ufw2WwP63ZN7s+SuafQ5c3OOUecreDR5M3PpHnLnGmtc6youDJ6lnwRktw/U/2j5Dku1h0GHFz23nzn8Ozh0WHFz23nzlr0V3HZY3aPl3lSZ9Tjw14rztCx3u87V5r3RmiWA3mHrP0Bxa39xbZx6ELzmq7et0xR8Z/DW9bzHXZuWjtMuibsRQwRN4MYR444nmuHl7Sz2neef996lfRUtO9rTPxWMWsc+8RnofuoP/0sseEIZ0GPwmUyHWP4o+rT9D91JTtX/tX5IbaD/rZZ0ulIX4B9jwdgfseivYtZhyconn7VW+nyU6wmq0gEBAQEBAQEBAQEBAQEBAQEBAQYqqoZGxz3uDGtF3OJsAOZWa1m07RHNmtZtO0OW62a/wAk14qUujiyMmT3/wAu9jf93dku7pOza09LLzny8I/P2djTaGtfSyc58vD+WiSzhvfw+66k2iF3Jnrjj2vVFSvmNydlnz7vuuTre0a4eUc7eXl70eKmTP6VuUNipYWsFmiw/wAzXls+a+W3Fed5X4pFY2hYQqldrZPgCqXhDZZw0Exyif8A0kfNaxp8tulZ+StbPjjraEtmiKg/wz1LR9VtGhzz+n7IZ1WLzZRoWf4B/UPuto7Oz+X1a/7mLzT6KGsjwsHN+EuHkdyuYMesxcuseW6tltp7+yfcu43Ei5aWngbYeC6tZmY3mNlGY2l6WzAgICAgICAgICAgICAgICCHpbScNNE6WV4a1viTua0byeC3x47ZLcNY5tqUm87Q4xrVrVNXPxuyFpuyIHwc/i7yG7ifR6XSUwR5z5/h2tPgrij2+bWaiqtgM/l/dWbX26M5tVw+jXqyaMoNvtv9n/u/suPrtd3foU9b7fyzo9JOWe8v0+6/Y8ZDdwXnbRaecu1w7coSoSobI5TYlWsjlJYFFKOVto7Ss8XsvJHwu7Q88ui2pqcmPpPzU82mxX6x8m1aM05HLYO7DuByPcfouhg1tMnKeUuTm0l8fOOcLZXVUQEBAQEBAQEBAQEBAQEBAQEELTOlYaWJ00rtlrfFx3NaN5K3xYrZLcNeratZtO0OHazaxTVsu2/stbcRxg4MH1cd5+mC9LptNXBXaOvjLp4aRjjaFBUVFsB1Kltbwgy59vRqxUsO0eQ8+SpanUd3G0dZS6DR9/bit6sfX2Lhjic93l3BcOYh6T0axtCXC8KC1JlHa0J0NQ0b/JVrYLyhsmR1bOJ8CoZ0mXyRzEpEdbHx8io7aLN5fVpNZXdFQSSN242h7eLXNPiAbg8iq99Jmj9Knkz0rPDadp90pQoZW5xPH7SquTBljrWfkj77HPS0LXRulHM7L7lvm37hWNN2hbFPDk5x9YVM2nrf0q9WwxyBwBBuDkV3qXrevFWd4c6YmJ2l6WzAgICAgICAg8TStY0ucQAMyVra0VjeWa1m07Q12q1jcTaNoA4uxJ6blysvaNt9scfN0segjb05+SL/AMfnHvNPe0fRQRr83nHyTf6WKUqn1o+OPq0/Q/dWcfaM/rr8kN+zv+s/NcUWlIZcGvF/hOB8Dn0V/FqMeT1ZUsunyY/WhNUyEQRtI10cEbpZXBjGC7ifkOJOQG8lbUpa9orXqzEb8nCtbdZpa6bbddsbLiKP4Rxdxed/gOfpNLpq4K7ePjP98FzHEVhr1RNbAZ/JT2ts2vl25QjxMLjZV8uSMdeKTT4bZ8kUqtYmgCw3LiXvN7cUvX48VcVIpXpDOxRyxaGdi1QykMRpLM0LLDM0LIl0VVJE7bjeWOG8fIjIjkU2R5MVMkcN43b5oDW5slo5rMfkHe648/hPl8lHNfJw9V2dbH6WPnH1hsz42uzaD3i6itjraNrRu5sWmOjxDTNYeyLXzAy8N3RaY9PTFPoRt7PBta826symaCAgICAgICDTdZ9JF8nqwezHgebt/hl4rj63LNrcEdI+7s6HBw0456z9lQJFQ4V7YMicJwvBes7M7PO0tjZdaM1kkjs2S8jePvDrv6+KvYdZavK3OPqo59BW/OnKfo2mDSUL4zKJG7DQS4k22QBc7V8rDiupjvGT1ebk5MVsduG0OLa9a3OrpNlhLaeM9huW2cvWOHyG4cyV6LR6WMNd59afp7G1Y2anLLsi/grkzs3m+0IW0o90MSn08dhzK4mrz95faOkPU9n6buce9vWn+7MiqL76HHiVkZWTvHvIbJMVa7gCs7tZrCXFXDe09MU3a8C6oKGSZpdE31gHtBpBc3vZ7XW1lndWyZqY52vO3v6fPo+Ojc02c0tPAgg+BWW9bRaN4nd7aEZbVq1rIY7RTEmPJrjiWcjxb8lravk5Os0MX9PH18vP+W8tcCLg3ByKjcN9QEBAQEBAQYqqoZG0ve4NaMyf8zWtrRWN5bUpa88NY5uXyVFyXOIFySSeJxK4dom07vUVrtERDH+Pj+LyP2WO6t5M8MvTaphycD/nBYnHMeDPCybS12Y2NpNmHwlbRA1HWHTZfeKNx2MnkHB5Bvbm0EeK9f2R2d3Md7k9aekeUflxdbqYyTwV6QorruqcWQJpdo8tyimd0Nr7yj1MthYZlaWlY09OKd/J8grJR75Pfiqt9Pjt4OvTVZa9J+awhrSc2joq1tHH6ZW6a+f1R8kpkgKr2096rdNVjt47e9laopjZYid+jMwLAzMCwwmUVQ+N4kje5j25OGBH9uSNb0revDaN4dS1X1kirW+pqGM9aBkQC2Qby0HJ3EdRyx0eb1mivpp48czw/WPen1mqNK/FodEf0m4/pN/KyzxSix9o5qdZ396irNU52YstKOXZd/SfoVtxQv4u0sduVuX2StW9LuhcIJrtaTZu0CCwncb+6fJYtG/OEWs01cle9x/Hbx/luS0cYQEBAQEBBoGt9dLNUeoja55Zg1jcbut2nHkL2ucseKo5t8l+GPB3NDjpixd7edt/sqqjVKv2dsxh36Q5pcOn0CdxaI6J69oaeZ23+jX3XBIIsRgQcCCMwQotl2OfOHglNmzNBXPZvuOB+nBa2xxLE1iVpTVjX5YHh9uKgtjmqOazCh1k01a8MZxye4buLRz4+Hd6HsjszfbPlj3R+8/s42v1sRvjxz75/ZrAXpnJiUerm90dfstbW8Gt7eCKFGj3fJYrjnuSa7pNNnnHfeekobXEFRy7Uc+awpJWnDI/5ko5hvCyjYtG8QzsatLRFusJK2tXpK60DRQTP9VJKYXONo5LBzNrc14wIvucD3hVMuHaN6pZ1uWkb7cUfVaaU1Nrae5MXrGj34u2OrbbQ8Lc1VT4e0cGXlvtPt/PRTsCLyTCS0hzSQQQQRgQRkQeKMTEWjaXWdUNYBVR7L7CWMDbGW0Nzx9RuPeFiXldfo/9e+8erPT8NgWFBgq6OOUWkY1w57u45hZidm9Ml8c71nZ6podhoaCSBgL4m24X3rDFrcU7sqNRAQEBAQRKLR0cTnvaO1K4ue45m5uBfgNw+61isRvskvlteIiekdEtbI2hekvRLGs/GNFtktbLYZgkNa823gkAngeSjtp5yT6HX7ulotdGH0ck+j9v4c/El8Qb9yqTWYnaXoK2i0bxO8PMkgAuSAOJW1MdrztWN5YveuOOK87QqavSZODCR+rI9OC72j7Linp5uc+X5ed1va83iaYeUef4V4XaceJeJ5tkc9y1tbZtNtkElRtGWJm9bVhiJiZ2ZQxbJ60YKqkv2hnvHHuUd425r+nybejKNG1QyvQ2DVyB08rINtrXSXbGXZF9rtaTu2rWBxxI6Q5J4Y4i1+GN5WVTQyRPMcjHMe3NpzH3HMYFaRaJjeElZi0bw9MjTdvs6x6PdPmaP1EhvJEOyTm+PIE8SMAe8c1Qz4+Gd4crV4OCeKOkrjS+rVLU3L4gHn+Izsv6kZ9bqHdjBrc2H1Z5eU9GlaX1Inhu6I+uZwAs8ft39PBZ3dvT9q4snLJ6M/T+FNoyrfTytkbg5hxBwuMnNd8kX82KufHNJ6T/AHd16gq2TRtkYbteLjlxB5g4dFq8flx2xXmlusJCIxAQEBAQEBAQEEfSFGyaJ8MguyVjmOHJwseuKzW01mLR4MTG8bS/NemNHTUc8lO8ua6NxFwSA5ubXi24ix68l6Gvd5qxaYiXOi2TDM1raY90zCEXk5knvN1LWla+rGzM3ted7TM++d30LZtEvE04bzPD7rE22bRKE55JuVHvuMkEZceQzRplycFZlPbGt4UIzS+mNbxLuaPJ3uPefDkALOy5FXms0W9kbJ7Xjlc9oIya9h7TDwNiHDkTwKpXmIvNVzFffl4wwwSOYQ9ps5hDmng5pu0+IC1mN+Uptt+Uv0ZW6Lp9JU0Ujm2MkbZI5B7TNtodnvGOIPzxXIi9sdphyqZLYbTs5npnQM1JJsSDA+w8ey8cufEbvNXKZIvHJ1sWWuSN4NEVjoJWTNzYbkcW5OHUXCXjijZvkxxes1l2iCVr2te03a4BwPEEXC508nBmJidpZEYVOmtX4KkXc3Zfukbg7lfiO/yWd1vTa3Lp59GeXl4K3VqlmpJDTydqOS7onjLaAxaeBIF7fpOaLOty49TWMtOVo5TH7toWHLEBAQEBAQEBAQEHNfTNq6ZIRWxtu+nFpRvMFydr9hJPcXcFf0OfgtwT0n7q+fFxRu4t+L/T5rrcarFXh9S45YLE3ltDEtWXuJhcQBmUmYjq2iJnfaOnP5LynpNhtvE8VibbRu5k3nLkj28nqJlxfit6Xi1YtHij1GG+DLbFfrWdkllPtMI33uO+yqajP3OatvDbm9X/AI5h7/S5a+MWiY+SFsrpxzjeFzg25S6JqDodldo6rpHm35oex3wSGMBrh1ZjxBI3rla+0481bR5fugy27u8WhzKppXxPdHI0tfG4tc3g5psf/qki0TG8L0TExvDv3owqNvRlOT7oezoyR7R5ALlaiNskuXqI2ySv9I0Ec8ZjkaHNPiDuIO481FW01neEdL2pO9XL9PaBkpX2PaY72H8eR4OVymSLQ7WDPGWPa3bUOs26bYOcTi39p7TfmR0VfNG1t3O1tOHJv5tkUSoIBCAgICAgICAgICAgIPjmgggi4OBB3hBwH0k+j+Sie6op2F1I7tEDEwcQ4f8AT4O3ZG1gT1tNqYvHDbr91XJjmJ3hoAPBW5nbqhjnO0JEVM87rDicPJQZNTjp47+50dN2XqM36do85/HVOhiDMs+K5uXPbJO8vU6Ps7Fp6TEc5nrP98GyRwgs29xbteV10O83pv7Hzm2CcWs7nyvt9VXos3BbwxHdv/zmtNDk5TSXoP8AKtFw5K6ivjyn3x0+n2T2vAds3xIuOah7Qn0o9y9/iVdsOSf/AKj7I9ZFjtcc+9Xezc/FXu56x09zsazBtbjjxbh6J9JeqqnRE9moaB+9m05vltDqFp2rHKs+/wDZzNTg4sM3j9O3yn+wzemDV7ZlZWMbhLaOW3xgdhx72gi/6G8VU0uTlwyr6TJvHBLZ/RIf+XgfDLIPEg/VQan10Oq/9jdFArI9fRxzMMcjbtd5cCDuIWYmYneG1LzSeKrW9WKB9LVSwOxa9m2x25wY63j28R/ZS5LcVYld1OSMuKLx1jq2xQqAgICAgICAgICAgICAgICDSdaPR1TVJMkJ/DynE7IvG479pmFieLbcSCs7y6Gl7Qth5WjePr83L9P6n19JcyQFzB/EjvIy3E2F2/uAR3cGuw5ek7T5Tya8CsrrYqWcChcd42o+rjh5OHgrVb/+J43U6Kbdu02jlO1/lHP6wpaGTZkadxNj1w+yj09+HJEvQ9r6b/Y0d6+MRvHvjmyaZd+Z3NHjcn7KXWTvkUv8ax8Oi387TP2j9kukqPWNsfaGf0KhwZJx5IvHg716xes1lI0dUOie2RvtRua8d7TcDyXU7RmLRSY8d/2VMOLirak+PJ3PTFCytpHx3GzNGCx3AkB0buh2SuNW3Dbd5Sszjv7lL6LoCyjLXCxE0gI4EbLSPEFb5p3sk1U73+Db1EriDyWAkG2IyPC+aD0gICAgICAgICAgICAgICAgICDXtO6l0FXcyQBrz/Ej7D78SRg79wKLeDW5sPq25eU84c51i9GtZAw/h3/iYtrb2LBsgNrX2cnYcDfktuKejq6ftHBfJ3mSOG+22/htvv8ABoEzHNJaQWuabEEEEHgQcQUdqJi0ecPtXNtvLuP2A+i3vfjtxK+j08afDXFHh+d3inn2HB3jzG9arS9B3jerNsk2pWvkVrtMz5u0ej6r9ZQw3zjBjP7HEN/27Kq3jm8l2nj4NTb28/mvKWlbHtbIttvc8/zOxd4nHqsbqMzuzrDAgICAgICAgICAgICAgICAgICAgICAgotZdUqSub+bHZ4HZlb2XjhjvHI3CLOn1mXBPoTy8vBwPWfRQpKmSn9a2X1ZHaAIzANiNzhcXsSpu6vFIvMcpeh0faeHUzwRO1vL8eaoJUborfRct2W+E26blJWW9HWvRFU3hnjv7MjX9wezZ/8AGVrked7dptkpbzjb5T/Lf1G4YgICAgICAgICAgICAgICAgICAgICAgIKDXTWNlDTOkNjI7sxM+J9sz+kZnwzIU2DDOW+3h4oc2WMdd5fnWd7nuc95LnPcXOcc3OcbknmSSu/wxtw+DkRltFuOJ2nqwyMt3Lj6rT91O8dJe87G7WjWU4L+vH1jz/KXod/aI4j5H+5VavV3qTzdV9ELvzqgcY4z4Odb5lL9HG7dj0KT7Z/Z09RvNiAgICAgICAgICAgICAgICAgICAgICCDpnSsNLE6aV2y1vi47mtG8lb48dsluGqPJkrjrxWcE1p05LWzmaTAZRs3MZwHE7yd55WA7+HBXFXhhwsuectt5Umwpdke72yIG4K1yY4vWaylwaq+ny1y06x/dviwaPBbKAeY8ivP2rNLTWfB9V0meufHXLTpMbuteiFn5tSeDIh4uf/AOqxfo5vbs+jjj2z+zpyjecEBAQEBAQEBAQEBAQEBAQEBAQEBAQVmntOQUke3K7E+ywYueeDR9cgpcOG+W21UOfPTDXezjGsunZ62XbkwAwjjGIaDuHFx3nf3WC72DBTDXaPjLgZtRfNbefhCfojUSZ7DPVE00DGl7iR+YWgXOyw+z+7HkVBl1lYnhx85+ixi0dpjiyco+rUqotc9xYzYaSdltydlu4EnM2zKt1iYjn1VLTEzMw9wU5ttEEB2R42wNuuCzExKO+8bI74rTsPEHyB+4XJ19NssT5w99/iWom+ntjn9M/Sef5dj9EtKRTyyEf6kuyObWNH1c7wXPusduZN81a+Uff+w3pauKICAgICAgICAgICAgICAgICAgICCl0tpSoxZS07pX5bbuxEzntOtt9zfFT4sdJ55LbR9VbLlydMVd5+kfn4NZZqFPUSGWsqrudmGC5tuAc4WaBwDbK5/vUx14cVfmpR2ffJbizW5+z+/s2rQ+rdJS4xQtDvjd2n/wBRxHcLBUsuoyZPWlfxabHi9WPy0f0qaw7R/BxuwaQ6Yjec2s6YOPO3Aq/oNP8A8k/D8uf2hqf+Kvx/DW9T9UJa1+0bsgae2/e62bY+J55DyVjU6qMUbR1VtLpbZZ3nona8sjFUYo2hsdPGyJoGQAG2fN563WdFv3XFPWZ3Q9oWjvuGOkREfv8Auha0aH/DQURcLSSCplfyv6gNae5tupK5upy95lnbpHJ7j/E8E46W36ztM/X9nW9VNHfh6SGIizgy7/53dp/m4qpM81bWZu+z2v7eXu6QtlhWEBAQEBAQEBAQEBAQEBAQEBAQEBAQEGua4axfhmbEfankwY0C+zfDaI+Q3nuKtabT97O8+rHVR1urjDHDX1p6NW1b1AfI711ZcAna9VftvJN7yO3X4Z47lbz66Kxw4vn+FPS9n2t6eb5ePxdFAjhjwDWMjbkAAGtaL4AbrBczne3tl154aV8ohzrVnQ5rKl1RI38sPMjr+88naazuFxfkAN66+pyxgxRjr122/l5/RYJ1Oactum+/x8lnpyi/GaWhiteOkiEsnC7nbQb12Y8OF1yI5Ru93psn+vor38bzwx8Os/VvK1ccQEBAQEBAQEBAQEBAQEBAQEBAQEBAQeJtqx2bB24m5A5kDPuw7wkbeLFt9uSBo/QsUTzKbyTO9qV+LjybuaN1hbCylvmtaOHpHkgxaalLTfrafGev8LJRLCn1hY+ZopozYy4yO3MiBxJ5kiwG/HgVY081pPeW8OntlS1kWyxGGnj19kfz0T6GkjgjEbBZrB3k7yTxJUV72vabWWcWKuKkUr0hD0Do4xCSR/8Aq1DzJIeG6NncxoDe+53rWVzPm4+GserWNo/efjK1WFcQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQeWsAubZ580Y2ekZEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBB//2Q==\" alt=\"\">\r\n" + //
                        "            <h1 id=\"logo_text\">ISRDC Jabalpur</h1>\r\n" + //
                        "        </div>\r\n" + //
                        "        <div id=\"menu\">\r\n" + //
                        "            <ul>\r\n" + //
                        "                <li><a href=\"#\">Home</a></li>\r\n" + //
                        "                <li><a href=\"#\">Products</a></li>\r\n" + //
                        "                <li><a href=\"#\">Services</a></li>\r\n" + //
                        "                <li><a href=\"#\">Contact Us</a></li>\r\n" + //
                        "            </ul>\r\n" + //
                        "        </div>\r\n" + //
                        "        <div id=\"main_body\">\r\n" + //
                        "            <p id=\"text\">\r\n" + //
                        "                Welcome " + name + ", r\n" + //
                        "                Click over the <a href='http://localhost:8080/64_minapp/verify.do?email=" + email + "&verification_code=" + verificationCode + "'>verification link</a> to verify your email and activate your account! r\n" + //                        
                        "                Regards,  r\n" + //
                        "                ISRDC Jabalpur,  r\n" + //
                        "            </p>\r\n" + //
                        "        </div>\r\n" + //
                        "        <div id=\"footer\">\r\n" + //
                        "            &copy; ISRDC Jabalpur since 765 AD\r\n" + //
                        "        </div>\r\n" + //
                        "    </div>\r\n" + //
                        "</body>\r\n" + //
                        "</html>";
    }    
}