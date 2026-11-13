.class public Lcom/google/android/gms/fido/common/Transport$UnsupportedTransportException;
.super Ljava/lang/Exception;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fido/common/Transport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UnsupportedTransportException"
.end annotation

.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct/range {p0 .. p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method
