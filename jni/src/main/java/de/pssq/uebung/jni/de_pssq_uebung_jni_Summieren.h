/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class de_pssq_uebung_jni_Summieren */

#ifndef _Included_de_pssq_uebung_jni_Summieren
#define _Included_de_pssq_uebung_jni_Summieren
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     de_pssq_uebung_jni_Summieren
 * Method:    summiere
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_de_pssq_uebung_jni_Summieren_summiere
  (JNIEnv *, jobject, jdouble, jdouble);

/*
 * Class:     de_pssq_uebung_jni_Summieren
 * Method:    summiereAsString
 * Signature: (DD)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_de_pssq_uebung_jni_Summieren_summiereAsString
  (JNIEnv *, jobject, jdouble, jdouble);

/*
 * Class:     de_pssq_uebung_jni_Summieren
 * Method:    summiereCallback
 * Signature: (DD)V
 */
JNIEXPORT void JNICALL Java_de_pssq_uebung_jni_Summieren_summiereCallback
  (JNIEnv *, jobject, jdouble, jdouble);

#ifdef __cplusplus
}
#endif
#endif
