package org.tabish.generic;
class GenStr<T extends String>
{
  T str;
 
   GenStr(T o)
   {
      o=str;
   }
T getStr(){return str;};
}