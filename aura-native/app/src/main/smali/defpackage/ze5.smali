.class public abstract Ldefpackage/ze5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/tl1;

.field public static final b:Ljava/util/TimeZone;

.field public static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/xe5;->c:Ldefpackage/tl1;

    .line 2
    .line 3
    sput-object v0, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 4
    .line 5
    const-string v0, "GMT"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldefpackage/ze5;->b:Ljava/util/TimeZone;

    .line 15
    .line 16
    const-class v0, Ldefpackage/o83;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "okhttp3."

    .line 23
    .line 24
    invoke-static {v0, v1}, Ldefpackage/qm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "Client"

    .line 29
    .line 30
    invoke-static {v0, v1}, Ldefpackage/qm4;->p0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/lit8 v1, v1, -0x6

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_0
    sput-object v0, Ldefpackage/ze5;->c:Ljava/lang/String;

    .line 48
    .line 49
    return-void
.end method

.method public static final a(Ldefpackage/gr1;Ldefpackage/gr1;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p1, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget v0, p0, Ldefpackage/gr1;->e:I

    .line 18
    .line 19
    iget v1, p1, Ldefpackage/gr1;->e:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/gr1;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-object p1, p1, Ldefpackage/gr1;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static final b(JLjava/util/concurrent/TimeUnit;)I
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const-string v4, "timeout"

    .line 10
    .line 11
    if-ltz v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    const-wide/32 v5, 0x7fffffff

    .line 18
    .line 19
    .line 20
    cmp-long p2, p0, v5

    .line 21
    .line 22
    if-gtz p2, :cond_2

    .line 23
    .line 24
    cmp-long p2, p0, v0

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    if-gtz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p0, " too small"

    .line 32
    .line 33
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ldefpackage/kf2;->e(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return v3

    .line 41
    :cond_1
    :goto_0
    long-to-int p0, p0

    .line 42
    return p0

    .line 43
    :cond_2
    const-string p0, " too large"

    .line 44
    .line 45
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Ldefpackage/kf2;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return v3

    .line 53
    :cond_3
    const-string p0, " < 0"

    .line 54
    .line 55
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Ldefpackage/nz2;->f(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return v3
.end method

.method public static final c(Ljava/net/Socket;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    :catch_0
    return-void

    .line 8
    :catch_1
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "bio == null"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    throw p0

    .line 23
    :catch_2
    move-exception p0

    .line 24
    throw p0
.end method

.method public static final varargs d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    array-length v1, p1

    .line 9
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final e(Ldefpackage/k14;)J
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/k14;->s:Ldefpackage/tl1;

    .line 2
    .line 3
    const-string v0, "Content-Length"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object v2, Ldefpackage/xe5;->a:[B

    .line 14
    .line 15
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :catch_0
    :cond_0
    return-wide v0
.end method

.method public static final varargs f([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [Ljava/lang/Object;

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public static final g(Ldefpackage/fw;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Ldefpackage/xe5;->b:Ldefpackage/cb3;

    .line 8
    .line 9
    invoke-interface {p0, v0}, Ldefpackage/fw;->m(Ldefpackage/cb3;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v0, -0x1

    .line 14
    if-eq p0, v0, :cond_7

    .line 15
    .line 16
    if-eqz p0, :cond_6

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    if-eq p0, p1, :cond_5

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    if-eq p0, p1, :cond_4

    .line 23
    .line 24
    const/4 p1, 0x3

    .line 25
    if-eq p0, p1, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x4

    .line 28
    if-ne p0, p1, :cond_1

    .line 29
    .line 30
    sget-object p0, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 31
    .line 32
    sget-object p0, Ldefpackage/w10;->d:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    const-string p0, "UTF-32LE"

    .line 37
    .line 38
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sput-object p0, Ldefpackage/w10;->d:Ljava/nio/charset/Charset;

    .line 46
    .line 47
    :cond_0
    return-object p0

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    sget-object p0, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 55
    .line 56
    sget-object p0, Ldefpackage/w10;->e:Ljava/nio/charset/Charset;

    .line 57
    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    const-string p0, "UTF-32BE"

    .line 61
    .line 62
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    sput-object p0, Ldefpackage/w10;->e:Ljava/nio/charset/Charset;

    .line 70
    .line 71
    :cond_3
    return-object p0

    .line 72
    :cond_4
    sget-object p0, Ldefpackage/w10;->c:Ljava/nio/charset/Charset;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_5
    sget-object p0, Ldefpackage/w10;->b:Ljava/nio/charset/Charset;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    sget-object p0, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_7
    return-object p1
.end method

.method public static final h(Ldefpackage/ej4;I)Z
    .locals 12

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Ldefpackage/fu4;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const-wide v4, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Ldefpackage/fu4;->c()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    sub-long/2addr v6, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-wide v6, v4

    .line 36
    :goto_0
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    int-to-long v8, p1

    .line 41
    invoke-virtual {v0, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    add-long/2addr v8, v1

    .line 50
    invoke-virtual {v3, v8, v9}, Ldefpackage/fu4;->d(J)Ldefpackage/fu4;

    .line 51
    .line 52
    .line 53
    :try_start_0
    new-instance p1, Ldefpackage/tv;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    :goto_1
    const-wide/16 v8, 0x2000

    .line 59
    .line 60
    invoke-interface {p0, p1, v8, v9}, Ldefpackage/ej4;->read(Ldefpackage/tv;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v8

    .line 64
    const-wide/16 v10, -0x1

    .line 65
    .line 66
    cmp-long v0, v8, v10

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1}, Ldefpackage/tv;->b()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    cmp-long p1, v6, v4

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ldefpackage/fu4;->a()Ldefpackage/fu4;

    .line 86
    .line 87
    .line 88
    return v0

    .line 89
    :cond_2
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    add-long/2addr v1, v6

    .line 94
    invoke-virtual {p0, v1, v2}, Ldefpackage/fu4;->d(J)Ldefpackage/fu4;

    .line 95
    .line 96
    .line 97
    return v0

    .line 98
    :goto_2
    cmp-long v0, v6, v4

    .line 99
    .line 100
    if-nez v0, :cond_3

    .line 101
    .line 102
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Ldefpackage/fu4;->a()Ldefpackage/fu4;

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    add-long/2addr v1, v6

    .line 115
    invoke-virtual {p0, v1, v2}, Ldefpackage/fu4;->d(J)Ldefpackage/fu4;

    .line 116
    .line 117
    .line 118
    :goto_3
    throw p1

    .line 119
    :catch_0
    cmp-long p1, v6, v4

    .line 120
    .line 121
    if-nez p1, :cond_4

    .line 122
    .line 123
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Ldefpackage/fu4;->a()Ldefpackage/fu4;

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_4
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    add-long/2addr v1, v6

    .line 136
    invoke-virtual {p0, v1, v2}, Ldefpackage/fu4;->d(J)Ldefpackage/fu4;

    .line 137
    .line 138
    .line 139
    :goto_4
    const/4 p0, 0x0

    .line 140
    return p0
.end method

.method public static final i(Ljava/util/List;)Ldefpackage/tl1;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ldefpackage/pl1;

    .line 23
    .line 24
    iget-object v2, v1, Ldefpackage/pl1;->a:Ldefpackage/yw;

    .line 25
    .line 26
    iget-object v1, v1, Ldefpackage/pl1;->b:Ldefpackage/yw;

    .line 27
    .line 28
    invoke-virtual {v2}, Ldefpackage/yw;->q()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1}, Ldefpackage/yw;->q()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance p0, Ldefpackage/tl1;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    new-array v1, v1, [Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, [Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {p0, v0}, Ldefpackage/tl1;-><init>([Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object p0
.end method

.method public static final j(Ldefpackage/gr1;Z)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ldefpackage/gr1;->e:I

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, ":"

    .line 9
    .line 10
    invoke-static {v1, v2}, Ldefpackage/qm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "["

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v1, 0x5d

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_0
    if-nez p1, :cond_4

    .line 36
    .line 37
    iget-object p0, p0, Ldefpackage/gr1;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const-string p1, "http"

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const/16 p0, 0x50

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const-string p1, "https"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    const/16 p0, 0x1bb

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    const/4 p0, -0x1

    .line 65
    :goto_0
    if-eq v0, p0, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    return-object v1

    .line 69
    :cond_4
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const/16 p1, 0x3a

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public static final k(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method
