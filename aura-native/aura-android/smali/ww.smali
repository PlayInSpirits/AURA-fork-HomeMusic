.class public final Lww;
.super Ljava/io/OutputStream;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "ByteStreams.nullOutputStream()"

    .line 2
    .line 3
    return-object p0
.end method

.method public final write(I)V
    .locals 0

    .line 11
    return-void
.end method

.method public final write([B)V
    .locals 0

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final write([BII)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    add-int/2addr p3, p2

    .line 5
    array-length p0, p1

    .line 6
    invoke-static {p2, p3, p0}, Lrr2;->u(III)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
