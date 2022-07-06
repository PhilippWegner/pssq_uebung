#include <stdio.h>
#include <string.h>
#include "Summieren.h"

JNIEXPORT jdouble JNICALL Java_de_pssq_uebung_jni_Summieren_summiere
    (JNIEnv * env, jobject obj, jdouble zahl1, jdouble zahl2)
{
    double summe = zahl1 + zahl2;
    return summe;
    //return (*env)->GetDoubleField(env, summe);
}


JNIEXPORT jstring JNICALL Java_de_pssq_uebung_jni_Summieren_summiereAsString
  (JNIEnv * env, jobject obj, jdouble zahl1, jdouble zahl2)
{
    double summe = zahl1 + zahl2;

    char output[50] = "";
    sprintf(output, "%.2f", summe);
    return (*env)->NewStringUTF(env, output);
    //return output;
}

JNIEXPORT void JNICALL Java_de_pssq_uebung_jni_Summieren_summiereCallback
  (JNIEnv * env, jobject obj, jdouble zahl1, jdouble zahl2)
{
    double summeDouble = zahl1 + zahl2;

    char ausgabeString[30] = "Ergebnis: ";

    char summeString[50] = "";
    sprintf(summeString, "%.2f", summeDouble);

    strcat(ausgabeString, summeString); //ausgabeString += summeString

    jstring javaAusgabeString = (*env)->NewStringUTF(env, ausgabeString);

    jclass jcls = (*env)->GetObjectClass(env, obj);
    jmethodID jmethod = (*env)->GetMethodID(env, jcls, "ergebnisAusgeben", "(Ljava/lang/String;)V");

    (*env)->CallVoidMethod(env, obj, jmethod, javaAusgabeString);
}
