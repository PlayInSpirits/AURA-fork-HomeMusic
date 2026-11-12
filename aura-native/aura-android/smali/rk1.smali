.class public final Lrk1;
.super Li90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:Ljava/io/FilterInputStream;

.field public final p:[B

.field public q:I

.field public r:Ljava/util/zip/Inflater;

.field public final s:Ljava/util/zip/CRC32;

.field public t:Z

.field public final u:[B

.field public final v:Ly41;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Li90;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2000

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Lrk1;->p:[B

    .line 9
    .line 10
    new-instance v0, Ljava/util/zip/Inflater;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 17
    .line 18
    new-instance v0, Ljava/util/zip/CRC32;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lrk1;->s:Ljava/util/zip/CRC32;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lrk1;->t:Z

    .line 27
    .line 28
    new-array v0, v1, [B

    .line 29
    .line 30
    iput-object v0, p0, Lrk1;->u:[B

    .line 31
    .line 32
    new-instance v0, Ly41;

    .line 33
    .line 34
    const/16 v1, 0x19

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ly41;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lrk1;->v:Ly41;

    .line 40
    .line 41
    new-instance v0, Ldf0;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Ldf0;-><init>(Ljava/io/InputStream;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    iput-object v0, p0, Lrk1;->o:Ljava/io/FilterInputStream;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, Ljava/io/BufferedInputStream;

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lrk1;->o:Ljava/io/FilterInputStream;

    .line 61
    .line 62
    :goto_0
    iget-object p1, p0, Lrk1;->v:Ly41;

    .line 63
    .line 64
    iget-object v0, p0, Lrk1;->o:Ljava/io/FilterInputStream;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    const/16 v2, 0x1f

    .line 71
    .line 72
    if-ne v1, v2, :cond_7

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/16 v2, 0x8b

    .line 79
    .line 80
    if-ne v1, v2, :cond_7

    .line 81
    .line 82
    new-instance v1, Ljava/io/DataInputStream;

    .line 83
    .line 84
    invoke-direct {v1, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/16 v2, 0x8

    .line 92
    .line 93
    if-ne v0, v2, :cond_6

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    and-int/lit16 v3, v0, 0xe0

    .line 100
    .line 101
    if-nez v3, :cond_5

    .line 102
    .line 103
    invoke-static {v1}, Lgh0;->l(Ljava/io/DataInputStream;)J

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 113
    .line 114
    .line 115
    and-int/lit8 p1, v0, 0x4

    .line 116
    .line 117
    if-eqz p1, :cond_1

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    shl-int/lit8 v2, v3, 0x8

    .line 128
    .line 129
    or-int/2addr p1, v2

    .line 130
    :goto_1
    add-int/lit8 v2, p1, -0x1

    .line 131
    .line 132
    if-lez p1, :cond_1

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 135
    .line 136
    .line 137
    move p1, v2

    .line 138
    goto :goto_1

    .line 139
    :cond_1
    and-int/lit8 p1, v0, 0x8

    .line 140
    .line 141
    const-string v2, "ISO-8859-1"

    .line 142
    .line 143
    if-eqz p1, :cond_2

    .line 144
    .line 145
    new-instance p1, Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {v1}, Lrk1;->f(Ljava/io/DataInputStream;)[B

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-direct {p1, v3, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_2
    and-int/lit8 p1, v0, 0x10

    .line 155
    .line 156
    if-eqz p1, :cond_3

    .line 157
    .line 158
    new-instance p1, Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v1}, Lrk1;->f(Ljava/io/DataInputStream;)[B

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-direct {p1, v3, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    and-int/lit8 p1, v0, 0x2

    .line 168
    .line 169
    if-eqz p1, :cond_4

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readShort()S

    .line 172
    .line 173
    .line 174
    :cond_4
    iget-object p1, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->reset()V

    .line 177
    .line 178
    .line 179
    iget-object p0, p0, Lrk1;->s:Ljava/util/zip/CRC32;

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/util/zip/CRC32;->reset()V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_5
    const-string p0, "Reserved flags are set in the .gz header"

    .line 186
    .line 187
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    const-string p0, "Unsupported compression method "

    .line 192
    .line 193
    const-string p1, " in the .gz header"

    .line 194
    .line 195
    invoke-static {v0, p0, p1}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :goto_2
    return-void

    .line 203
    :cond_7
    new-instance p0, Ljava/io/IOException;

    .line 204
    .line 205
    const-string p1, "Input is not in the .gz format"

    .line 206
    .line 207
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw p0
.end method

.method public static f(Ljava/io/DataInputStream;)[B
    .locals 2

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :goto_1
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    :catchall_1
    move-exception v1

    .line 28
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :catchall_2
    move-exception v0

    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_2
    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 10
    .line 11
    :cond_0
    sget-object v0, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 12
    .line 13
    iget-object p0, p0, Lrk1;->o:Ljava/io/FilterInputStream;

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final read()I
    .locals 3

    const/4 v0, 0x1

    .line 177
    iget-object v1, p0, Lrk1;->u:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lrk1;->read([BII)I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    aget-byte p0, v1, v2

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public final read([BII)I
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Lrk1;->t:Z

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_1
    move v1, v0

    .line 13
    :cond_2
    if-lez p3, :cond_9

    .line 14
    .line 15
    iget-object v3, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-object v4, p0, Lrk1;->o:Ljava/io/FilterInputStream;

    .line 22
    .line 23
    if-eqz v3, :cond_4

    .line 24
    .line 25
    iget-object v3, p0, Lrk1;->p:[B

    .line 26
    .line 27
    array-length v5, v3

    .line 28
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->mark(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v3}, Ljava/io/InputStream;->read([B)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    iput v5, p0, Lrk1;->q:I

    .line 36
    .line 37
    if-eq v5, v2, :cond_3

    .line 38
    .line 39
    iget-object v6, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 40
    .line 41
    invoke-virtual {v6, v3, v0, v5}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    new-instance p0, Ljava/io/EOFException;

    .line 46
    .line 47
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_4
    :goto_0
    :try_start_0
    iget-object v3, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 52
    .line 53
    invoke-virtual {v3, p1, p2, p3}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 54
    .line 55
    .line 56
    move-result v3
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    iget-object v5, p0, Lrk1;->s:Ljava/util/zip/CRC32;

    .line 58
    .line 59
    invoke-virtual {v5, p1, p2, v3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 60
    .line 61
    .line 62
    add-int/2addr p2, v3

    .line 63
    sub-int/2addr p3, v3

    .line 64
    add-int/2addr v1, v3

    .line 65
    int-to-long v6, v3

    .line 66
    invoke-virtual {p0, v6, v7}, Li90;->b(J)V

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/zip/Inflater;->finished()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/io/InputStream;->reset()V

    .line 78
    .line 79
    .line 80
    iget p1, p0, Lrk1;->q:I

    .line 81
    .line 82
    iget-object p2, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    sub-int/2addr p1, p2

    .line 89
    int-to-long p1, p1

    .line 90
    invoke-static {v4, p1, p2}, Lvr1;->G(Ljava/io/InputStream;J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    cmp-long p1, v6, p1

    .line 95
    .line 96
    if-nez p1, :cond_8

    .line 97
    .line 98
    iput v0, p0, Lrk1;->q:I

    .line 99
    .line 100
    new-instance p1, Ljava/io/DataInputStream;

    .line 101
    .line 102
    invoke-direct {p1, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lgh0;->l(Ljava/io/DataInputStream;)J

    .line 106
    .line 107
    .line 108
    move-result-wide p2

    .line 109
    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    cmp-long p2, p2, v3

    .line 114
    .line 115
    if-nez p2, :cond_7

    .line 116
    .line 117
    invoke-static {p1}, Lgh0;->l(Ljava/io/DataInputStream;)J

    .line 118
    .line 119
    .line 120
    move-result-wide p1

    .line 121
    iget-object p3, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 122
    .line 123
    invoke-virtual {p3}, Ljava/util/zip/Inflater;->getBytesWritten()J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    const-wide v5, 0xffffffffL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    and-long/2addr v3, v5

    .line 133
    cmp-long p1, p1, v3

    .line 134
    .line 135
    if-nez p1, :cond_6

    .line 136
    .line 137
    iget-object p1, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->end()V

    .line 140
    .line 141
    .line 142
    const/4 p1, 0x0

    .line 143
    iput-object p1, p0, Lrk1;->r:Ljava/util/zip/Inflater;

    .line 144
    .line 145
    const/4 p1, 0x1

    .line 146
    iput-boolean p1, p0, Lrk1;->t:Z

    .line 147
    .line 148
    if-nez v1, :cond_5

    .line 149
    .line 150
    :goto_1
    return v2

    .line 151
    :cond_5
    return v1

    .line 152
    :cond_6
    const-string p0, "Gzip-compressed data is corrupt(uncompressed size mismatch)"

    .line 153
    .line 154
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return v0

    .line 158
    :cond_7
    const-string p0, "Gzip-compressed data is corrupt (CRC32 error)"

    .line 159
    .line 160
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return v0

    .line 164
    :cond_8
    new-instance p0, Ljava/io/IOException;

    .line 165
    .line 166
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 167
    .line 168
    .line 169
    throw p0

    .line 170
    :catch_0
    const-string p0, "Gzip-compressed data is corrupt"

    .line 171
    .line 172
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return v0

    .line 176
    :cond_9
    return v1
.end method
