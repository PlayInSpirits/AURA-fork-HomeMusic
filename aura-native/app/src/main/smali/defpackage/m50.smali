.class public final Ldefpackage/m50;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:S

.field public final b:S

.field public final c:I


# direct methods
.method public constructor <init>(ISS)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p2, p0, Ldefpackage/m50;->a:S

    .line 5
    .line 6
    iput-short p3, p0, Ldefpackage/m50;->b:S

    .line 7
    .line 8
    iput p1, p0, Ldefpackage/m50;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/ByteArrayOutputStream;)V
    .locals 1

    .line 1
    iget-short v0, p0, Ldefpackage/m50;->a:S

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/g12;->S(S)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 8
    .line 9
    .line 10
    iget-short v0, p0, Ldefpackage/m50;->b:S

    .line 11
    .line 12
    invoke-static {v0}, Ldefpackage/g12;->S(S)[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 17
    .line 18
    .line 19
    iget p0, p0, Ldefpackage/m50;->c:I

    .line 20
    .line 21
    invoke-static {p0}, Ldefpackage/g12;->b(I)[B

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write([B)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
