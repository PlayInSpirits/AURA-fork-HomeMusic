.class public abstract Ldefpackage/ji2;
.super Ljava/lang/Object;

# interfaces
.implements Ldefpackage/bg4;


# static fields
.field public static final a:Ldefpackage/r70;

.field public static final b:Ldefpackage/d71;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/d60;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Ldefpackage/d60;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ldefpackage/r70;

    .line 9
    .line 10
    const v3, 0x2637f2a9

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v3, v2, v0}, Ldefpackage/r70;-><init>(IZLdefpackage/sf1;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Ldefpackage/ji2;->a:Ldefpackage/r70;

    .line 17
    .line 18
    new-instance v0, Ldefpackage/d71;

    .line 19
    .line 20
    sget-object v1, Ldefpackage/lq0;->p:Ldefpackage/lq0;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ldefpackage/d71;-><init>(Ldefpackage/lq0;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Ldefpackage/ji2;->b:Ldefpackage/d71;

    .line 26
    .line 27
    return-void
.end method

.method public static final A(Ldefpackage/lg4;Ldefpackage/bi;I)V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Ldefpackage/lg4;->v:I

    .line 2
    .line 3
    if-le p2, v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Ldefpackage/lg4;->u:I

    .line 6
    .line 7
    if-lt p2, v1, :cond_1

    .line 8
    .line 9
    :cond_0
    if-nez v0, :cond_2

    .line 10
    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    :cond_1
    return-void

    .line 14
    :cond_2
    invoke-virtual {p0}, Ldefpackage/lg4;->M()V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Ldefpackage/lg4;->v:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ldefpackage/lg4;->y(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {p1}, Ldefpackage/bi;->g()V

    .line 26
    .line 27
    .line 28
    :cond_3
    invoke-virtual {p0}, Ldefpackage/lg4;->j()V

    .line 29
    .line 30
    .line 31
    goto :goto_0
.end method

.method public static D(DD)D
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldefpackage/h12;->R(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p2, p3}, Ldefpackage/h12;->R(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    invoke-static {p0, p1, p2, p3}, Ldefpackage/ji2;->E(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0
.end method

.method public static E(DD)D
    .locals 3

    .line 1
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(DD)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmpl-double v2, v0, p2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-wide p0, p2

    .line 11
    :goto_0
    const-wide/high16 p2, 0x4014000000000000L    # 5.0

    .line 12
    .line 13
    add-double/2addr v0, p2

    .line 14
    add-double/2addr p0, p2

    .line 15
    div-double/2addr v0, p0

    .line 16
    return-wide v0
.end method

.method public static F(Ljava/io/File;)[B
    .locals 8

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    const-wide/32 v3, 0x7fffffff

    .line 11
    .line 12
    .line 13
    cmp-long v3, v1, v3

    .line 14
    .line 15
    const-string v4, "File "

    .line 16
    .line 17
    if-gtz v3, :cond_5

    .line 18
    .line 19
    long-to-int v1, v1

    .line 20
    :try_start_1
    new-array v2, v1, [B

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    move v5, v1

    .line 24
    move v6, v3

    .line 25
    :goto_0
    if-lez v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v2, v6, v5}, Ljava/io/FileInputStream;->read([BII)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-ltz v7, :cond_0

    .line 32
    .line 33
    sub-int/2addr v5, v7

    .line 34
    add-int/2addr v6, v7

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_0
    if-lez v5, :cond_1

    .line 40
    .line 41
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/io/FileInputStream;->read()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const/4 v6, -0x1

    .line 51
    if-ne v5, v6, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    new-instance v6, Ldefpackage/a51;

    .line 55
    .line 56
    const/16 v7, 0x2001

    .line 57
    .line 58
    invoke-direct {v6, v7}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6, v5}, Ljava/io/OutputStream;->write(I)V

    .line 62
    .line 63
    .line 64
    const/16 v5, 0x2000

    .line 65
    .line 66
    new-array v5, v5, [B

    .line 67
    .line 68
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    :goto_1
    if-ltz v7, :cond_3

    .line 73
    .line 74
    invoke-virtual {v6, v5, v3, v7}, Ljava/io/OutputStream;->write([BII)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    add-int/2addr v5, v1

    .line 87
    if-ltz v5, :cond_4

    .line 88
    .line 89
    invoke-virtual {v6}, Ldefpackage/a51;->b()[B

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-static {v1, v3, v4, p0, v2}, Ldefpackage/ti;->X(III[B[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    .line 104
    :goto_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 105
    .line 106
    .line 107
    return-object v2

    .line 108
    :cond_4
    :try_start_2
    new-instance v1, Ljava/lang/OutOfMemoryError;

    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p0, " is too big to fit in memory."

    .line 122
    .line 123
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-direct {v1, p0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_5
    new-instance v3, Ljava/lang/OutOfMemoryError;

    .line 135
    .line 136
    new-instance v5, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string p0, " is too big ("

    .line 145
    .line 146
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string p0, " bytes) to fit in memory."

    .line 153
    .line 154
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-direct {v3, p0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 166
    :catchall_1
    move-exception v1

    .line 167
    invoke-static {v0, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    throw v1
.end method

.method public static G(Ldefpackage/h00;III)I
    .locals 4

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-gt v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->l(Z)V

    .line 18
    .line 19
    .line 20
    shl-int v0, v2, p1

    .line 21
    .line 22
    sub-int/2addr v0, v2

    .line 23
    shl-int v1, v2, p2

    .line 24
    .line 25
    sub-int/2addr v1, v2

    .line 26
    invoke-static {v0, v1}, Ldefpackage/h12;->h(II)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    shl-int/2addr v2, p3

    .line 31
    invoke-static {v3, v2}, Ldefpackage/h12;->h(II)I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/h00;->b()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ge v2, p1, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/h00;->i(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-ne p1, v0, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0}, Ldefpackage/h00;->b()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-ge v0, p2, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {p0, p2}, Ldefpackage/h00;->i(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    add-int/2addr p1, p2

    .line 59
    if-ne p2, v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0}, Ldefpackage/h00;->b()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-ge p2, p3, :cond_3

    .line 66
    .line 67
    :goto_1
    const/4 p0, -0x1

    .line 68
    return p0

    .line 69
    :cond_3
    invoke-virtual {p0, p3}, Ldefpackage/h00;->i(I)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    add-int/2addr p0, p1

    .line 74
    return p0

    .line 75
    :cond_4
    return p1
.end method

.method public static H(Ljava/io/File;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/InputStreamReader;

    .line 7
    .line 8
    new-instance v2, Ljava/io/FileInputStream;

    .line 9
    .line 10
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance p0, Ljava/io/StringWriter;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/io/StringWriter;-><init>()V

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x2000

    .line 22
    .line 23
    new-array v0, v0, [C

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/io/Reader;->read([C)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    :goto_0
    if-ltz v2, :cond_0

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {p0, v0, v3, v2}, Ljava/io/Writer;->write([CII)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/io/Reader;->read([C)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    :catchall_1
    move-exception v0

    .line 54
    invoke-static {v1, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    throw v0
.end method

.method public static I(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v2, Ldefpackage/cb4;

    .line 6
    .line 7
    new-instance p0, Landroid/content/ComponentName;

    .line 8
    .line 9
    const-class v0, Lcom/eddyizm/tempus/service/MediaService;

    .line 10
    .line 11
    invoke-direct {p0, v1, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v1, p0}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 15
    .line 16
    .line 17
    sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 18
    .line 19
    new-instance v4, Ldefpackage/tv1;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    new-instance v6, Ldefpackage/bl2;

    .line 29
    .line 30
    invoke-direct {v6, v5}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, v2, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 34
    .line 35
    invoke-interface {p0}, Ldefpackage/bb4;->e()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    new-instance p0, Ldefpackage/xc5;

    .line 42
    .line 43
    new-instance v0, Ldefpackage/x7;

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    new-instance v7, Ldefpackage/fi0;

    .line 49
    .line 50
    invoke-direct {v7, v0}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x4

    .line 54
    invoke-direct {p0, v0, v7}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    move-object v7, p0

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const/4 p0, 0x0

    .line 60
    goto :goto_0

    .line 61
    :goto_1
    new-instance v0, Ldefpackage/sk2;

    .line 62
    .line 63
    invoke-direct/range {v0 .. v7}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Landroid/os/Handler;

    .line 67
    .line 68
    invoke-direct {p0, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Ldefpackage/pk2;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-direct {v2, v6, v0, v3}, Ldefpackage/pk2;-><init>(Ldefpackage/bl2;Ldefpackage/sk2;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v2}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    new-instance p0, Ldefpackage/w85;

    .line 81
    .line 82
    const/4 v0, 0x2

    .line 83
    invoke-direct {p0, v0, v6, v1}, Ldefpackage/w85;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 87
    .line 88
    invoke-virtual {v6, p0, v0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static J(Landroid/content/Context;I)I
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const-string v0, "appWidgetMinHeight"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f0b0050

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const v2, 0x7f0b0051

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const v2, 0x7f0b0052

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-lt p1, v0, :cond_1

    .line 53
    .line 54
    const/4 p0, 0x4

    .line 55
    return p0

    .line 56
    :cond_1
    if-lt p1, v1, :cond_2

    .line 57
    .line 58
    const/4 p0, 0x3

    .line 59
    return p0

    .line 60
    :cond_2
    if-lt p1, p0, :cond_3

    .line 61
    .line 62
    const/4 p0, 0x2

    .line 63
    return p0

    .line 64
    :cond_3
    const/4 p0, 0x1

    .line 65
    return p0
.end method

.method public static final K(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-wide v2, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p0, v2

    .line 20
    long-to-int p0, p0

    .line 21
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-long v4, v1

    .line 30
    shl-long v0, v4, v0

    .line 31
    .line 32
    int-to-long p0, p0

    .line 33
    and-long/2addr p0, v2

    .line 34
    or-long/2addr p0, v0

    .line 35
    return-wide p0
.end method

.method public static L(F)I
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const-string p0, "Cannot round NaN value."

    .line 13
    .line 14
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static M(F)J
    .locals 2

    .line 1
    float-to-double v0, p0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0

    .line 13
    :cond_0
    const-string p0, "Cannot round NaN value."

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    return-wide v0
.end method

.method public static N(Landroid/view/ViewGroup;F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Ldefpackage/fi2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Ldefpackage/fi2;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->l(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static O(Landroid/view/View;Ldefpackage/fi2;)V
    .locals 3

    .line 1
    iget-object v0, p1, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ei2;->b:Ldefpackage/nz0;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, v0, Ldefpackage/nz0;->a:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    instance-of v1, p0, Landroid/view/View;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    check-cast v1, Landroid/view/View;

    .line 22
    .line 23
    sget-object v2, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getElevation()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-float/2addr v0, v1

    .line 30
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object p0, p1, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 36
    .line 37
    iget v1, p0, Ldefpackage/ei2;->l:F

    .line 38
    .line 39
    cmpl-float v1, v1, v0

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iput v0, p0, Ldefpackage/ei2;->l:F

    .line 44
    .line 45
    invoke-virtual {p1}, Ldefpackage/fi2;->u()V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public static P(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldefpackage/fi2;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ldefpackage/fi2;

    .line 10
    .line 11
    invoke-static {p0, v0}, Ldefpackage/ji2;->O(Landroid/view/View;Ldefpackage/fi2;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static Q(Ldefpackage/h00;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/h00;->t(I)V

    .line 3
    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ldefpackage/h00;->t(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/h00;->h()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Ldefpackage/h00;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x5

    .line 21
    invoke-virtual {p0, v0}, Ldefpackage/h00;->t(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x6

    .line 27
    invoke-virtual {p0, v0}, Ldefpackage/h00;->t(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public static R(Ldefpackage/h00;)V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/h00;->i(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x6

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ldefpackage/h00;->t(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/16 v3, 0x10

    .line 14
    .line 15
    const/4 v4, 0x5

    .line 16
    const/16 v5, 0x8

    .line 17
    .line 18
    invoke-static {p0, v4, v5, v3}, Ldefpackage/ji2;->G(Ldefpackage/h00;III)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v6, 0x1

    .line 23
    add-int/2addr v3, v6

    .line 24
    const/4 v7, 0x7

    .line 25
    if-ne v1, v6, :cond_1

    .line 26
    .line 27
    mul-int/2addr v3, v7

    .line 28
    invoke-virtual {p0, v3}, Ldefpackage/h00;->t(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    if-ne v1, v0, :cond_9

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/h00;->h()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    move v8, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v8, v4

    .line 43
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    move v4, v7

    .line 46
    :cond_3
    if-eqz v1, :cond_4

    .line 47
    .line 48
    move v2, v5

    .line 49
    :cond_4
    const/4 v1, 0x0

    .line 50
    move v5, v1

    .line 51
    :goto_1
    if-ge v5, v3, :cond_9

    .line 52
    .line 53
    invoke-virtual {p0}, Ldefpackage/h00;->h()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const/16 v10, 0xb4

    .line 58
    .line 59
    if-eqz v9, :cond_5

    .line 60
    .line 61
    invoke-virtual {p0, v7}, Ldefpackage/h00;->t(I)V

    .line 62
    .line 63
    .line 64
    move v9, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_5
    invoke-virtual {p0, v0}, Ldefpackage/h00;->i(I)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    const/4 v11, 0x3

    .line 71
    if-ne v9, v11, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0, v4}, Ldefpackage/h00;->i(I)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    mul-int/2addr v9, v8

    .line 78
    if-eqz v9, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0}, Ldefpackage/h00;->s()V

    .line 81
    .line 82
    .line 83
    :cond_6
    invoke-virtual {p0, v2}, Ldefpackage/h00;->i(I)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    mul-int/2addr v9, v8

    .line 88
    if-eqz v9, :cond_7

    .line 89
    .line 90
    if-eq v9, v10, :cond_7

    .line 91
    .line 92
    invoke-virtual {p0}, Ldefpackage/h00;->s()V

    .line 93
    .line 94
    .line 95
    :cond_7
    invoke-virtual {p0}, Ldefpackage/h00;->s()V

    .line 96
    .line 97
    .line 98
    :goto_2
    if-eqz v9, :cond_8

    .line 99
    .line 100
    if-eq v9, v10, :cond_8

    .line 101
    .line 102
    invoke-virtual {p0}, Ldefpackage/h00;->h()Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_8

    .line 107
    .line 108
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    :cond_8
    add-int/2addr v5, v6

    .line 111
    goto :goto_1

    .line 112
    :cond_9
    return-void
.end method

.method public static S(Ldefpackage/rk0;Z)Z
    .locals 12

    .line 1
    new-instance v0, Ldefpackage/be3;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/be3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    move v3, v2

    .line 10
    :cond_0
    :goto_0
    const/16 v4, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v4}, Ldefpackage/be3;->K(I)V

    .line 13
    .line 14
    .line 15
    iget-object v5, v0, Ldefpackage/be3;->a:[B

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-virtual {p0, v5, v6, v4, v2}, Ldefpackage/rk0;->e([BIIZ)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-nez v5, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    invoke-virtual {v0}, Ldefpackage/be3;->C()J

    .line 26
    .line 27
    .line 28
    move-result-wide v7

    .line 29
    invoke-virtual {v0}, Ldefpackage/be3;->m()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-wide/16 v9, 0x1

    .line 34
    .line 35
    cmp-long v9, v7, v9

    .line 36
    .line 37
    if-nez v9, :cond_3

    .line 38
    .line 39
    iget-object v7, v0, Ldefpackage/be3;->a:[B

    .line 40
    .line 41
    invoke-virtual {p0, v7, v4, v4, v2}, Ldefpackage/rk0;->e([BIIZ)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-nez v7, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v0}, Ldefpackage/be3;->G()J

    .line 49
    .line 50
    .line 51
    move-result-wide v7

    .line 52
    move v9, v1

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move v9, v4

    .line 55
    :goto_1
    int-to-long v9, v9

    .line 56
    cmp-long v11, v7, v9

    .line 57
    .line 58
    if-gez v11, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    sub-long/2addr v7, v9

    .line 62
    long-to-int v7, v7

    .line 63
    if-eqz v3, :cond_9

    .line 64
    .line 65
    const v3, 0x66747970

    .line 66
    .line 67
    .line 68
    if-ne v5, v3, :cond_8

    .line 69
    .line 70
    if-ge v7, v4, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    const/4 v3, 0x4

    .line 74
    invoke-virtual {v0, v3}, Ldefpackage/be3;->K(I)V

    .line 75
    .line 76
    .line 77
    iget-object v4, v0, Ldefpackage/be3;->a:[B

    .line 78
    .line 79
    invoke-virtual {p0, v4, v6, v3, v6}, Ldefpackage/rk0;->e([BIIZ)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ldefpackage/be3;->m()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    const v4, 0x68656963

    .line 87
    .line 88
    .line 89
    if-eq v3, v4, :cond_6

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    if-nez p1, :cond_7

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    add-int/lit8 v7, v7, -0x4

    .line 96
    .line 97
    invoke-virtual {p0, v7, v6}, Ldefpackage/rk0;->o(IZ)Z

    .line 98
    .line 99
    .line 100
    move v3, v6

    .line 101
    goto :goto_0

    .line 102
    :cond_8
    :goto_2
    return v6

    .line 103
    :cond_9
    const v4, 0x6d707664

    .line 104
    .line 105
    .line 106
    if-ne v5, v4, :cond_a

    .line 107
    .line 108
    :goto_3
    return v2

    .line 109
    :cond_a
    if-eqz v7, :cond_0

    .line 110
    .line 111
    invoke-virtual {p0, v7, v6}, Ldefpackage/rk0;->o(IZ)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0
.end method

.method public static T(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const v1, 0x7f130591

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object/from16 v1, p1

    .line 22
    .line 23
    :goto_0
    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    const v3, 0x7f130592

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    move-object v4, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object/from16 v4, p2

    .line 39
    .line 40
    :goto_1
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    move-object/from16 v3, p3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const-string v3, ""

    .line 50
    .line 51
    :goto_2
    const-wide/16 v5, 0x0

    .line 52
    .line 53
    move-wide/from16 v7, p8

    .line 54
    .line 55
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    cmp-long v9, p10, v5

    .line 60
    .line 61
    if-lez v9, :cond_3

    .line 62
    .line 63
    move-wide/from16 v9, p10

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    move-wide v9, v5

    .line 67
    :goto_3
    cmp-long v11, v9, v5

    .line 68
    .line 69
    if-lez v11, :cond_4

    .line 70
    .line 71
    cmp-long v12, v7, v9

    .line 72
    .line 73
    if-lez v12, :cond_4

    .line 74
    .line 75
    move-wide v7, v9

    .line 76
    :cond_4
    const/4 v13, 0x0

    .line 77
    const/4 v12, 0x1

    .line 78
    if-gtz v11, :cond_6

    .line 79
    .line 80
    cmp-long v14, v7, v5

    .line 81
    .line 82
    if-lez v14, :cond_5

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    move-object v14, v13

    .line 86
    goto :goto_5

    .line 87
    :cond_6
    :goto_4
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    invoke-static {v14, v12}, Ldefpackage/e03;->h(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v14

    .line 95
    :goto_5
    if-lez v11, :cond_7

    .line 96
    .line 97
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v15

    .line 101
    invoke-static {v15, v12}, Ldefpackage/e03;->h(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    goto :goto_6

    .line 106
    :cond_7
    move-object v12, v13

    .line 107
    :goto_6
    const/4 v15, 0x0

    .line 108
    if-lez v11, :cond_8

    .line 109
    .line 110
    const-wide/16 v16, 0x3e8

    .line 111
    .line 112
    mul-long v7, v7, v16

    .line 113
    .line 114
    div-long/2addr v7, v9

    .line 115
    cmp-long v5, v7, v5

    .line 116
    .line 117
    if-gez v5, :cond_9

    .line 118
    .line 119
    :cond_8
    move v5, v15

    .line 120
    goto :goto_7

    .line 121
    :cond_9
    cmp-long v5, v7, v16

    .line 122
    .line 123
    if-lez v5, :cond_a

    .line 124
    .line 125
    const/16 v5, 0x3e8

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_a
    long-to-int v5, v7

    .line 129
    :goto_7
    new-instance v7, Ldefpackage/ge2;

    .line 130
    .line 131
    invoke-direct {v7, v5, v14, v12}, Ldefpackage/ge2;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-nez v5, :cond_c

    .line 139
    .line 140
    move-object v5, v3

    .line 141
    move-object v3, v1

    .line 142
    new-instance v1, Ldefpackage/ca5;

    .line 143
    .line 144
    move/from16 v6, p5

    .line 145
    .line 146
    move/from16 v8, p6

    .line 147
    .line 148
    move/from16 v9, p7

    .line 149
    .line 150
    move-object/from16 v10, p12

    .line 151
    .line 152
    move-object/from16 v11, p13

    .line 153
    .line 154
    move-object/from16 v12, p14

    .line 155
    .line 156
    invoke-direct/range {v1 .. v12}, Ldefpackage/ca5;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdefpackage/ge2;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const/16 v3, 0x200

    .line 160
    .line 161
    invoke-static {v3, v0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v2}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v4}, Ldefpackage/c04;->g()Ldefpackage/vz3;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v4, v3}, Ldefpackage/vz3;->P(Ljava/lang/String;)Ldefpackage/vz3;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    const/4 v4, 0x2

    .line 178
    invoke-static {v4, v2, v0}, Ldefpackage/wg0;->a(ILandroid/content/Context;Ljava/lang/String;)Ldefpackage/g04;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v3, v0}, Ldefpackage/vz3;->G(Ldefpackage/lq;)Ldefpackage/vz3;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_b

    .line 191
    .line 192
    invoke-virtual {v0}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Ldefpackage/vz3;

    .line 197
    .line 198
    :cond_b
    sget-object v2, Ldefpackage/fh0;->g:Ldefpackage/of;

    .line 199
    .line 200
    invoke-virtual {v0, v1, v13, v0, v2}, Ldefpackage/vz3;->J(Ldefpackage/wq4;Ldefpackage/yz3;Ldefpackage/lq;Ljava/util/concurrent/Executor;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_c
    move-object v5, v3

    .line 205
    move-object v12, v7

    .line 206
    move-object v3, v1

    .line 207
    invoke-static {v2}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    new-instance v0, Landroid/content/ComponentName;

    .line 212
    .line 213
    const-class v1, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;

    .line 214
    .line 215
    invoke-direct {v0, v2, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v13, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    array-length v0, v14

    .line 223
    :goto_8
    if-ge v15, v0, :cond_d

    .line 224
    .line 225
    aget v11, v14, v15

    .line 226
    .line 227
    iget-object v7, v12, Ldefpackage/ge2;->b:Ljava/lang/String;

    .line 228
    .line 229
    iget v8, v12, Ldefpackage/ge2;->c:I

    .line 230
    .line 231
    move v1, v0

    .line 232
    move-object v0, v2

    .line 233
    move-object v2, v4

    .line 234
    const/4 v4, 0x0

    .line 235
    iget-object v6, v12, Ldefpackage/ge2;->a:Ljava/lang/String;

    .line 236
    .line 237
    move/from16 v9, p6

    .line 238
    .line 239
    move/from16 v10, p7

    .line 240
    .line 241
    move/from16 v16, v1

    .line 242
    .line 243
    move-object v1, v3

    .line 244
    move-object v3, v5

    .line 245
    move/from16 v5, p5

    .line 246
    .line 247
    invoke-static/range {v0 .. v11}, Ldefpackage/ji2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Ljava/lang/String;IZII)Landroid/widget/RemoteViews;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    move-object/from16 v5, p14

    .line 252
    .line 253
    move-object v6, v1

    .line 254
    move-object v7, v2

    .line 255
    move-object v8, v3

    .line 256
    move-object v1, v4

    .line 257
    move v2, v11

    .line 258
    move-object/from16 v3, p12

    .line 259
    .line 260
    move-object/from16 v4, p13

    .line 261
    .line 262
    invoke-static/range {v0 .. v5}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->a(Landroid/content/Context;Landroid/widget/RemoteViews;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v13, v2, v1}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 266
    .line 267
    .line 268
    add-int/lit8 v15, v15, 0x1

    .line 269
    .line 270
    move-object v2, v0

    .line 271
    move-object v3, v6

    .line 272
    move-object v4, v7

    .line 273
    move-object v5, v8

    .line 274
    move/from16 v0, v16

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_d
    return-void
.end method

.method public static U(Ljava/io/File;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/FileOutputStream;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {v1, p1, v0}, Ldefpackage/ji2;->V(Ljava/io/FileOutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :catchall_1
    move-exception p1

    .line 21
    invoke-static {v1, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public static final V(Ljava/io/FileOutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x4000

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/nio/charset/CharsetEncoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2, v0}, Ljava/nio/charset/CharsetEncoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const/16 v0, 0x2000

    .line 35
    .line 36
    invoke-static {v0}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/nio/charset/CharsetEncoder;->maxBytesPerChar()F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    float-to-double v2, v2

    .line 48
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    double-to-float v2, v2

    .line 53
    float-to-int v2, v2

    .line 54
    mul-int/2addr v0, v2

    .line 55
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    move v3, v2

    .line 64
    move v4, v3

    .line 65
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-ge v3, v5, :cond_4

    .line 70
    .line 71
    rsub-int v5, v4, 0x2000

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    sub-int/2addr v6, v3

    .line 78
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    add-int v6, v3, v5

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/nio/CharBuffer;->array()[C

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v3, v6, v7, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 92
    .line 93
    .line 94
    add-int/2addr v5, v4

    .line 95
    invoke-virtual {v1, v5}, Ljava/nio/CharBuffer;->limit(I)Ljava/nio/Buffer;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const/4 v4, 0x1

    .line 103
    if-ne v6, v3, :cond_1

    .line 104
    .line 105
    move v3, v4

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    move v3, v2

    .line 108
    :goto_1
    invoke-virtual {p2, v1, v0, v3}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;Z)Ljava/nio/charset/CoderResult;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v3}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_3

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-virtual {p0, v3, v2, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eq v3, v5, :cond_2

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/nio/CharBuffer;->get()C

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    invoke-virtual {v1, v2, v3}, Ljava/nio/CharBuffer;->put(IC)Ljava/nio/CharBuffer;

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_2
    move v4, v2

    .line 148
    :goto_2
    invoke-virtual {v1}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 152
    .line 153
    .line 154
    move v3, v6

    .line 155
    goto :goto_0

    .line 156
    :cond_3
    const-string p0, "Check failed."

    .line 157
    .line 158
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_4
    return-void
.end method

.method public static final c(Ldefpackage/h;Ljava/lang/String;Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;)Ljava/lang/Exception;
    .locals 0

    .line 1
    new-instance p2, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;

    .line 2
    .line 3
    invoke-direct {p2, p0, p1}, Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method

.method public static final g(F)I
    .locals 2

    .line 1
    float-to-double v0, p0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    double-to-float p0, v0

    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static h(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static i(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Ldefpackage/nz2;->c()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static j(Landroid/os/Handler;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "null current looper"

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v1, " thread, but got "

    .line 37
    .line 38
    const-string v2, "."

    .line 39
    .line 40
    const-string v3, "Must be called on "

    .line 41
    .line 42
    invoke-static {v3, p0, v1, v0, v2}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public static k(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Given String is empty or null"

    .line 9
    .line 10
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static m(Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "null reference"

    .line 5
    .line 6
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static o(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static p(J)B
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    shr-long v0, p0, v0

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    const-string v1, "out of range: %s"

    .line 15
    .line 16
    invoke-static {v0, v1, p0, p1}, Ldefpackage/rr2;->m(ZLjava/lang/String;J)V

    .line 17
    .line 18
    .line 19
    long-to-int p0, p0

    .line 20
    int-to-byte p0, p0

    .line 21
    return p0
.end method

.method public static q(Landroid/content/Context;I)Landroid/widget/RemoteViews;
    .locals 3

    .line 1
    invoke-static {p0, p1}, Ldefpackage/ji2;->J(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ldefpackage/xa3;->w(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq p1, v1, :cond_2

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq p1, v2, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    if-eq p1, v2, :cond_0

    .line 18
    .line 19
    const p1, 0x7f0d0130

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1, v0, v0}, Ldefpackage/rr2;->g(Landroid/content/Context;IZZ)Landroid/widget/RemoteViews;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const p1, 0x7f0d0131

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1, v1, v1}, Ldefpackage/rr2;->g(Landroid/content/Context;IZZ)Landroid/widget/RemoteViews;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const p1, 0x7f0d0132

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p1, v1, v1}, Ldefpackage/rr2;->g(Landroid/content/Context;IZZ)Landroid/widget/RemoteViews;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2
    const p1, 0x7f0d0133

    .line 44
    .line 45
    .line 46
    invoke-static {p0, p1, v0, v0}, Ldefpackage/rr2;->g(Landroid/content/Context;IZZ)Landroid/widget/RemoteViews;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Ljava/lang/String;IZII)Landroid/widget/RemoteViews;
    .locals 14

    .line 1
    move/from16 v1, p11

    .line 2
    .line 3
    invoke-static {p0, v1}, Ldefpackage/ji2;->J(Landroid/content/Context;I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ldefpackage/xa3;->w(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v1, v2, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    const v9, 0x7f0d0130

    .line 23
    .line 24
    .line 25
    move-object v0, p0

    .line 26
    move-object v1, p1

    .line 27
    move-object/from16 v2, p2

    .line 28
    .line 29
    move-object/from16 v3, p3

    .line 30
    .line 31
    move-object/from16 v4, p4

    .line 32
    .line 33
    move/from16 v5, p5

    .line 34
    .line 35
    move-object/from16 v6, p6

    .line 36
    .line 37
    move-object/from16 v7, p7

    .line 38
    .line 39
    move/from16 v8, p8

    .line 40
    .line 41
    move/from16 v12, p9

    .line 42
    .line 43
    move/from16 v13, p10

    .line 44
    .line 45
    invoke-static/range {v0 .. v13}, Ldefpackage/rr2;->O(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Ljava/lang/String;IIZZZI)Landroid/widget/RemoteViews;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_0
    const/4 v10, 0x1

    .line 51
    const/4 v11, 0x1

    .line 52
    const v9, 0x7f0d0131

    .line 53
    .line 54
    .line 55
    move-object v0, p0

    .line 56
    move-object v1, p1

    .line 57
    move-object/from16 v2, p2

    .line 58
    .line 59
    move-object/from16 v3, p3

    .line 60
    .line 61
    move-object/from16 v4, p4

    .line 62
    .line 63
    move/from16 v5, p5

    .line 64
    .line 65
    move-object/from16 v6, p6

    .line 66
    .line 67
    move-object/from16 v7, p7

    .line 68
    .line 69
    move/from16 v8, p8

    .line 70
    .line 71
    move/from16 v12, p9

    .line 72
    .line 73
    move/from16 v13, p10

    .line 74
    .line 75
    invoke-static/range {v0 .. v13}, Ldefpackage/rr2;->O(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Ljava/lang/String;IIZZZI)Landroid/widget/RemoteViews;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :cond_1
    const/4 v10, 0x1

    .line 81
    const/4 v11, 0x1

    .line 82
    const v9, 0x7f0d0132

    .line 83
    .line 84
    .line 85
    move-object v0, p0

    .line 86
    move-object v1, p1

    .line 87
    move-object/from16 v2, p2

    .line 88
    .line 89
    move-object/from16 v3, p3

    .line 90
    .line 91
    move-object/from16 v4, p4

    .line 92
    .line 93
    move/from16 v5, p5

    .line 94
    .line 95
    move-object/from16 v6, p6

    .line 96
    .line 97
    move-object/from16 v7, p7

    .line 98
    .line 99
    move/from16 v8, p8

    .line 100
    .line 101
    move/from16 v12, p9

    .line 102
    .line 103
    move/from16 v13, p10

    .line 104
    .line 105
    invoke-static/range {v0 .. v13}, Ldefpackage/rr2;->O(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Ljava/lang/String;IIZZZI)Landroid/widget/RemoteViews;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0

    .line 110
    :cond_2
    const/4 v10, 0x1

    .line 111
    const/4 v11, 0x1

    .line 112
    const v9, 0x7f0d0133

    .line 113
    .line 114
    .line 115
    move-object v0, p0

    .line 116
    move-object v1, p1

    .line 117
    move-object/from16 v2, p2

    .line 118
    .line 119
    move-object/from16 v3, p3

    .line 120
    .line 121
    move-object/from16 v4, p4

    .line 122
    .line 123
    move/from16 v5, p5

    .line 124
    .line 125
    move-object/from16 v6, p6

    .line 126
    .line 127
    move-object/from16 v7, p7

    .line 128
    .line 129
    move/from16 v8, p8

    .line 130
    .line 131
    move/from16 v12, p9

    .line 132
    .line 133
    move/from16 v13, p10

    .line 134
    .line 135
    invoke-static/range {v0 .. v13}, Ldefpackage/rr2;->O(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Ljava/lang/String;IIZZZI)Landroid/widget/RemoteViews;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0
.end method

.method public static s(JLdefpackage/be3;[Ldefpackage/wv4;)V
    .locals 10

    .line 1
    :goto_0
    invoke-virtual {p2}, Ldefpackage/be3;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-le v0, v1, :cond_d

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move v2, v0

    .line 10
    :cond_0
    invoke-virtual {p2}, Ldefpackage/be3;->a()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/16 v4, 0xff

    .line 15
    .line 16
    const/4 v5, -0x1

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v3, v5

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {p2}, Ldefpackage/be3;->A()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    add-int/2addr v2, v3

    .line 26
    if-eq v3, v4, :cond_0

    .line 27
    .line 28
    move v3, v2

    .line 29
    :goto_1
    move v2, v0

    .line 30
    :cond_2
    invoke-virtual {p2}, Ldefpackage/be3;->a()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    move v2, v5

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    invoke-virtual {p2}, Ldefpackage/be3;->A()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    add-int/2addr v2, v6

    .line 43
    if-eq v6, v4, :cond_2

    .line 44
    .line 45
    :goto_2
    iget v4, p2, Ldefpackage/be3;->b:I

    .line 46
    .line 47
    add-int/2addr v4, v2

    .line 48
    if-eq v2, v5, :cond_b

    .line 49
    .line 50
    invoke-virtual {p2}, Ldefpackage/be3;->a()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-le v2, v5, :cond_4

    .line 55
    .line 56
    goto :goto_6

    .line 57
    :cond_4
    const/4 v5, 0x4

    .line 58
    if-ne v3, v5, :cond_c

    .line 59
    .line 60
    const/16 v3, 0x8

    .line 61
    .line 62
    if-lt v2, v3, :cond_c

    .line 63
    .line 64
    invoke-virtual {p2}, Ldefpackage/be3;->A()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {p2}, Ldefpackage/be3;->H()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const/16 v5, 0x31

    .line 73
    .line 74
    if-ne v3, v5, :cond_5

    .line 75
    .line 76
    invoke-virtual {p2}, Ldefpackage/be3;->m()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    goto :goto_3

    .line 81
    :cond_5
    move v6, v0

    .line 82
    :goto_3
    invoke-virtual {p2}, Ldefpackage/be3;->A()I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    const/16 v8, 0x2f

    .line 87
    .line 88
    if-ne v3, v8, :cond_6

    .line 89
    .line 90
    invoke-virtual {p2, v1}, Ldefpackage/be3;->O(I)V

    .line 91
    .line 92
    .line 93
    :cond_6
    const/16 v9, 0xb5

    .line 94
    .line 95
    if-ne v2, v9, :cond_8

    .line 96
    .line 97
    if-eq v3, v5, :cond_7

    .line 98
    .line 99
    if-ne v3, v8, :cond_8

    .line 100
    .line 101
    :cond_7
    const/4 v2, 0x3

    .line 102
    if-ne v7, v2, :cond_8

    .line 103
    .line 104
    move v2, v1

    .line 105
    goto :goto_4

    .line 106
    :cond_8
    move v2, v0

    .line 107
    :goto_4
    if-ne v3, v5, :cond_a

    .line 108
    .line 109
    const v3, 0x47413934

    .line 110
    .line 111
    .line 112
    if-ne v6, v3, :cond_9

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_9
    move v1, v0

    .line 116
    :goto_5
    and-int/2addr v2, v1

    .line 117
    :cond_a
    if-eqz v2, :cond_c

    .line 118
    .line 119
    invoke-static {p0, p1, p2, p3}, Ldefpackage/ji2;->t(JLdefpackage/be3;[Ldefpackage/wv4;)V

    .line 120
    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_b
    :goto_6
    const-string v0, "CeaUtil"

    .line 124
    .line 125
    const-string v1, "Skipping remainder of malformed SEI NAL unit."

    .line 126
    .line 127
    invoke-static {v0, v1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iget v4, p2, Ldefpackage/be3;->c:I

    .line 131
    .line 132
    :cond_c
    :goto_7
    invoke-virtual {p2, v4}, Ldefpackage/be3;->N(I)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_d
    return-void
.end method

.method public static t(JLdefpackage/be3;[Ldefpackage/wv4;)V
    .locals 12

    .line 1
    invoke-virtual {p2}, Ldefpackage/be3;->A()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x40

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    and-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p2, v1}, Ldefpackage/be3;->O(I)V

    .line 13
    .line 14
    .line 15
    mul-int/lit8 v6, v0, 0x3

    .line 16
    .line 17
    iget v0, p2, Ldefpackage/be3;->b:I

    .line 18
    .line 19
    array-length v9, p3

    .line 20
    const/4 v10, 0x0

    .line 21
    move v11, v10

    .line 22
    :goto_0
    if-ge v11, v9, :cond_1

    .line 23
    .line 24
    aget-object v2, p3, v11

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ldefpackage/be3;->N(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v2, v6, p2}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 30
    .line 31
    .line 32
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmp-long v3, p0, v3

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    move v3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    move v3, v10

    .line 44
    :goto_1
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 45
    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v5, 0x1

    .line 50
    move-wide v3, p0

    .line 51
    invoke-interface/range {v2 .. v8}, Ldefpackage/wv4;->a(JIIILdefpackage/vv4;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v11, v11, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-void
.end method

.method public static final u(II)V
    .locals 3

    .line 1
    if-gt p0, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, ") is greater than size ("

    .line 5
    .line 6
    const-string v1, ")."

    .line 7
    .line 8
    const-string v2, "toIndex ("

    .line 9
    .line 10
    invoke-static {v2, v0, p0, p1, v1}, Ldefpackage/b11;->n(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Ldefpackage/kf2;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static v(I)Ldefpackage/su3;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Ldefpackage/m34;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ldefpackage/ch0;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ldefpackage/m34;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public static final w(JZIF)J
    .locals 0

    .line 1
    if-nez p2, :cond_2

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    if-ne p3, p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p2, 0x4

    .line 8
    if-ne p3, p2, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p2, 0x5

    .line 12
    if-ne p3, p2, :cond_3

    .line 13
    .line 14
    :cond_2
    :goto_0
    invoke-static {p0, p1}, Ldefpackage/nc0;->d(J)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_3

    .line 19
    .line 20
    invoke-static {p0, p1}, Ldefpackage/nc0;->h(J)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    goto :goto_1

    .line 25
    :cond_3
    const p2, 0x7fffffff

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-static {p0, p1}, Ldefpackage/nc0;->j(J)I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-ne p3, p2, :cond_4

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_4
    invoke-static {p4}, Ldefpackage/ji2;->g(F)I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    invoke-static {p0, p1}, Ldefpackage/nc0;->j(J)I

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    invoke-static {p3, p4, p2}, Ldefpackage/gb;->m(III)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    :goto_2
    invoke-static {p0, p1}, Ldefpackage/nc0;->g(J)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-static {p1, p2, p1, p0}, Ldefpackage/zz1;->m(IIII)J

    .line 53
    .line 54
    .line 55
    move-result-wide p0

    .line 56
    return-wide p0
.end method

.method public static final x(Ldefpackage/x34;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "SELECT changes()"

    .line 5
    .line 6
    invoke-interface {p0, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :try_start_0
    invoke-interface {p0}, Ldefpackage/z34;->O()Z

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-interface {p0, v0}, Ldefpackage/z34;->getLong(I)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    long-to-int v0, v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {p0, v1}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return v0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    :catchall_1
    move-exception v1

    .line 27
    invoke-static {p0, v0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v1
.end method

.method public static final y(Ldefpackage/dc3;Ldefpackage/hg3;)Ldefpackage/dx2;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/w72;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ldefpackage/w72;-><init>(Ldefpackage/dc3;Ldefpackage/hg3;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final z(JJ)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p2, v0

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    int-to-float v2, v2

    .line 14
    add-float/2addr v1, v2

    .line 15
    const-wide v2, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr p0, v2

    .line 21
    long-to-int p0, p0

    .line 22
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    and-long p1, p2, v2

    .line 27
    .line 28
    long-to-int p1, p1

    .line 29
    int-to-float p1, p1

    .line 30
    add-float/2addr p0, p1

    .line 31
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-long p1, p1

    .line 36
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    int-to-long v4, p0

    .line 41
    shl-long p0, p1, v0

    .line 42
    .line 43
    and-long p2, v4, v2

    .line 44
    .line 45
    or-long/2addr p0, p2

    .line 46
    return-wide p0
.end method


# virtual methods
.method public abstract B(Ldefpackage/f2;Ldefpackage/f2;)V
.end method

.method public abstract C(Ldefpackage/f2;Ljava/lang/Thread;)V
.end method

.method public a(Landroid/view/ViewGroup;Landroid/view/View;)F
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public abstract d(Ldefpackage/g2;Ldefpackage/c2;Ldefpackage/c2;)Z
.end method

.method public abstract e(Ldefpackage/g2;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract f(Ldefpackage/g2;Ldefpackage/f2;Ldefpackage/f2;)Z
.end method
