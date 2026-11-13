.class public abstract Ldefpackage/n14;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final Companion:Ldefpackage/m14;


# instance fields
.field private reader:Ljava/io/Reader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/m14;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    .line 7
    .line 8
    return-void
.end method

.method public static final create(Ldefpackage/fw;Ldefpackage/hu2;J)Ldefpackage/n14;
    .locals 7

    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    new-instance v1, Ldefpackage/fv3;

    const/4 v6, 0x1

    move-object v5, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v1 .. v6}, Ldefpackage/fv3;-><init>(Ljava/lang/Object;JLdefpackage/fw;I)V

    return-object v1
.end method

.method public static final create(Ldefpackage/hu2;JLdefpackage/fw;)Ldefpackage/n14;
    .locals 7
    .annotation runtime Ldefpackage/zo0;
    .end annotation

    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    new-instance v1, Ldefpackage/fv3;

    const/4 v6, 0x1

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Ldefpackage/fv3;-><init>(Ljava/lang/Object;JLdefpackage/fw;I)V

    return-object v1
.end method

.method public static final create(Ldefpackage/hu2;Ljava/lang/String;)Ldefpackage/n14;
    .locals 1
    .annotation runtime Ldefpackage/zo0;
    .end annotation

    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-static {p1, p0}, Ldefpackage/m14;->a(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/fv3;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ldefpackage/hu2;Ldefpackage/yw;)Ldefpackage/n14;
    .locals 7
    .annotation runtime Ldefpackage/zo0;
    .end annotation

    .line 1
    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v5, Ldefpackage/tv;

    .line 10
    .line 11
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v5, p1}, Ldefpackage/tv;->X(Ldefpackage/yw;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ldefpackage/yw;->d()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    int-to-long v3, p1

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v1, Ldefpackage/fv3;

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    move-object v2, p0

    .line 29
    invoke-direct/range {v1 .. v6}, Ldefpackage/fv3;-><init>(Ljava/lang/Object;JLdefpackage/fw;I)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public static final create(Ldefpackage/hu2;[B)Ldefpackage/n14;
    .locals 1
    .annotation runtime Ldefpackage/zo0;
    .end annotation

    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    invoke-static {p1, p0}, Ldefpackage/m14;->b([BLdefpackage/hu2;)Ldefpackage/fv3;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/n14;
    .locals 1

    .line 39
    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Ldefpackage/m14;->a(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/fv3;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ldefpackage/yw;Ldefpackage/hu2;)Ldefpackage/n14;
    .locals 7

    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    new-instance v5, Ldefpackage/tv;

    .line 42
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-virtual {v5, p0}, Ldefpackage/tv;->X(Ldefpackage/yw;)V

    .line 44
    invoke-virtual {p0}, Ldefpackage/yw;->d()I

    move-result p0

    int-to-long v3, p0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    new-instance v1, Ldefpackage/fv3;

    const/4 v6, 0x1

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ldefpackage/fv3;-><init>(Ljava/lang/Object;JLdefpackage/fw;I)V

    return-object v1
.end method

.method public static final create([BLdefpackage/hu2;)Ldefpackage/n14;
    .locals 1

    .line 40
    sget-object v0, Ldefpackage/n14;->Companion:Ldefpackage/m14;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Ldefpackage/m14;->b([BLdefpackage/hu2;)Ldefpackage/fv3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final byteStream()Ljava/io/InputStream;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/n14;->source()Ldefpackage/fw;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ldefpackage/fw;->V()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final byteString()Ldefpackage/yw;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldefpackage/n14;->contentLength()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-gtz v2, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/n14;->source()Ldefpackage/fw;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :try_start_0
    invoke-interface {p0}, Ldefpackage/fw;->E()Ldefpackage/yw;

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v3

    .line 26
    :goto_0
    move-object v6, v3

    .line 27
    move-object v3, v2

    .line 28
    move-object v2, v6

    .line 29
    goto :goto_1

    .line 30
    :catchall_1
    move-exception v2

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_2
    move-exception p0

    .line 38
    invoke-static {v2, p0}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_1
    if-nez v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {v3}, Ldefpackage/yw;->d()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    const-wide/16 v4, -0x1

    .line 48
    .line 49
    cmp-long v2, v0, v4

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    int-to-long v4, p0

    .line 54
    cmp-long v2, v0, v4

    .line 55
    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    new-instance v2, Ljava/io/IOException;

    .line 60
    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v4, "Content-Length ("

    .line 64
    .line 65
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ") and stream length ("

    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p0, ") disagree"

    .line 80
    .line 81
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-direct {v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v2

    .line 92
    :cond_2
    :goto_2
    return-object v3

    .line 93
    :cond_3
    throw v2

    .line 94
    :cond_4
    const-string p0, "Cannot buffer entire body for content length: "

    .line 95
    .line 96
    invoke-static {p0, v0, v1}, Ldefpackage/b11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v3
.end method

.method public final bytes()[B
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldefpackage/n14;->contentLength()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-gtz v2, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/n14;->source()Ldefpackage/fw;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :try_start_0
    invoke-interface {p0}, Ldefpackage/fw;->i()[B

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v3

    .line 26
    :goto_0
    move-object v6, v3

    .line 27
    move-object v3, v2

    .line 28
    move-object v2, v6

    .line 29
    goto :goto_1

    .line 30
    :catchall_1
    move-exception v2

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_2
    move-exception p0

    .line 38
    invoke-static {v2, p0}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_1
    if-nez v2, :cond_3

    .line 42
    .line 43
    array-length p0, v3

    .line 44
    const-wide/16 v4, -0x1

    .line 45
    .line 46
    cmp-long v2, v0, v4

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    int-to-long v4, p0

    .line 51
    cmp-long v2, v0, v4

    .line 52
    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    new-instance v2, Ljava/io/IOException;

    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v4, "Content-Length ("

    .line 61
    .line 62
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ") and stream length ("

    .line 69
    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p0, ") disagree"

    .line 77
    .line 78
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v2

    .line 89
    :cond_2
    :goto_2
    return-object v3

    .line 90
    :cond_3
    throw v2

    .line 91
    :cond_4
    const-string p0, "Cannot buffer entire body for content length: "

    .line 92
    .line 93
    invoke-static {p0, v0, v1}, Ldefpackage/b11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v3
.end method

.method public final charStream()Ljava/io/Reader;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/n14;->reader:Ljava/io/Reader;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Ldefpackage/l14;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/n14;->source()Ldefpackage/fw;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Ldefpackage/n14;->contentType()Ldefpackage/hu2;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {v2}, Ldefpackage/hu2;->a(Ldefpackage/hu2;)Ljava/nio/charset/Charset;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    :cond_0
    sget-object v2, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    :cond_1
    invoke-direct {v0, v1, v2}, Ldefpackage/l14;-><init>(Ldefpackage/fw;Ljava/nio/charset/Charset;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ldefpackage/n14;->reader:Ljava/io/Reader;

    .line 29
    .line 30
    :cond_2
    return-object v0
.end method

.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/n14;->source()Ldefpackage/fw;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/xe5;->b(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract contentLength()J
.end method

.method public abstract contentType()Ldefpackage/hu2;
.end method

.method public abstract source()Ldefpackage/fw;
.end method

.method public final string()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/n14;->source()Ldefpackage/fw;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/n14;->contentType()Ldefpackage/hu2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Ldefpackage/hu2;->a(Ldefpackage/hu2;)Ljava/nio/charset/Charset;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    :cond_0
    sget-object p0, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    :cond_1
    invoke-static {v0, p0}, Ldefpackage/ze5;->g(Ldefpackage/fw;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {v0, p0}, Ldefpackage/fw;->B(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :catchall_1
    move-exception v1

    .line 34
    invoke-static {v0, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method
