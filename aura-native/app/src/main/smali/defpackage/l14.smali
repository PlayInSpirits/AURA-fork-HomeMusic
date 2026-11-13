.class public final Ldefpackage/l14;
.super Ljava/io/Reader;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Ldefpackage/fw;

.field public final o:Ljava/nio/charset/Charset;

.field public p:Z

.field public q:Ljava/io/InputStreamReader;


# direct methods
.method public constructor <init>(Ldefpackage/fw;Ljava/nio/charset/Charset;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ldefpackage/l14;->n:Ldefpackage/fw;

    .line 11
    .line 12
    iput-object p2, p0, Ldefpackage/l14;->o:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/l14;->p:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/l14;->q:Ljava/io/InputStreamReader;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/l14;->n:Ldefpackage/fw;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final read([CII)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Ldefpackage/l14;->p:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/l14;->q:Ljava/io/InputStreamReader;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/io/InputStreamReader;

    .line 13
    .line 14
    iget-object v1, p0, Ldefpackage/l14;->n:Ldefpackage/fw;

    .line 15
    .line 16
    invoke-interface {v1}, Ldefpackage/fw;->V()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, p0, Ldefpackage/l14;->o:Ljava/nio/charset/Charset;

    .line 21
    .line 22
    invoke-static {v1, v3}, Ldefpackage/ze5;->g(Ldefpackage/fw;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v2, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Ldefpackage/l14;->q:Ljava/io/InputStreamReader;

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_1
    const-string p0, "Stream closed"

    .line 37
    .line 38
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return p0
.end method
