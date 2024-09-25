public interface ActionParam<T> {

   //T steht für generische Typparameter, dieser bildet
   //eine Art Platzhalter für Typen
   //auf dieses Weise kann dieses Interface
   //für jeden erdenklichen Typen gleichermaßen benutzt
   //werden
   void invoke( T value );
}
