.class public final Lme5;
.super Li90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic C:I


# instance fields
.field public final A:I

.field public B:J

.field public final o:[B

.field public final p:Lqs;

.field public final q:I

.field public r:I

.field public s:B

.field public t:I

.field public u:I

.field public final v:[I

.field public final w:[B

.field public final x:[B

.field public y:I

.field public final z:Z


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 7

    .line 1
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2
    .line 3
    invoke-direct {p0}, Li90;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    iput-object v2, p0, Lme5;->o:[B

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iput v2, p0, Lme5;->q:I

    .line 13
    .line 14
    const/16 v3, 0x9

    .line 15
    .line 16
    iput v3, p0, Lme5;->r:I

    .line 17
    .line 18
    iput v2, p0, Lme5;->t:I

    .line 19
    .line 20
    new-instance v3, Lqs;

    .line 21
    .line 22
    invoke-direct {v3, p1, v0}, Lqs;-><init>(Ljava/io/InputStream;Ljava/nio/ByteOrder;)V

    .line 23
    .line 24
    .line 25
    iput-object v3, p0, Lme5;->p:Lqs;

    .line 26
    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    iput-wide v4, p0, Lme5;->B:J

    .line 30
    .line 31
    const/16 p1, 0x8

    .line 32
    .line 33
    invoke-virtual {v3, p1}, Lqs;->b(I)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    long-to-int v0, v4

    .line 38
    invoke-virtual {v3, p1}, Lqs;->b(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    long-to-int v4, v4

    .line 43
    invoke-virtual {v3, p1}, Lqs;->b(I)J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    long-to-int p1, v5

    .line 48
    const/4 v3, 0x0

    .line 49
    const/16 v5, 0x1f

    .line 50
    .line 51
    if-ne v0, v5, :cond_5

    .line 52
    .line 53
    const/16 v0, 0x9d

    .line 54
    .line 55
    if-ne v4, v0, :cond_5

    .line 56
    .line 57
    if-ltz p1, :cond_5

    .line 58
    .line 59
    and-int/lit16 v0, p1, 0x80

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    move v0, v1

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v0, v4

    .line 67
    :goto_0
    iput-boolean v0, p0, Lme5;->z:Z

    .line 68
    .line 69
    and-int/2addr p1, v5

    .line 70
    iput p1, p0, Lme5;->A:I

    .line 71
    .line 72
    const/16 v5, 0x100

    .line 73
    .line 74
    if-eqz v0, :cond_1

    .line 75
    .line 76
    iput v5, p0, Lme5;->q:I

    .line 77
    .line 78
    :cond_1
    const-string v0, ", must be bigger than 0"

    .line 79
    .line 80
    const-string v6, "maxCodeSize is "

    .line 81
    .line 82
    if-lez p1, :cond_4

    .line 83
    .line 84
    if-lez p1, :cond_3

    .line 85
    .line 86
    shl-int p1, v1, p1

    .line 87
    .line 88
    new-array v0, p1, [I

    .line 89
    .line 90
    iput-object v0, p0, Lme5;->v:[I

    .line 91
    .line 92
    new-array v0, p1, [B

    .line 93
    .line 94
    iput-object v0, p0, Lme5;->w:[B

    .line 95
    .line 96
    new-array v0, p1, [B

    .line 97
    .line 98
    iput-object v0, p0, Lme5;->x:[B

    .line 99
    .line 100
    iput p1, p0, Lme5;->y:I

    .line 101
    .line 102
    :goto_1
    if-ge v4, v5, :cond_2

    .line 103
    .line 104
    iget-object p1, p0, Lme5;->v:[I

    .line 105
    .line 106
    aput v2, p1, v4

    .line 107
    .line 108
    iget-object p1, p0, Lme5;->w:[B

    .line 109
    .line 110
    int-to-byte v0, v4

    .line 111
    aput-byte v0, p1, v4

    .line 112
    .line 113
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    iget-boolean p1, p0, Lme5;->z:Z

    .line 117
    .line 118
    add-int/2addr p1, v5

    .line 119
    iput p1, p0, Lme5;->u:I

    .line 120
    .line 121
    return-void

    .line 122
    :cond_3
    invoke-static {p1, v6, v0}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v3

    .line 130
    :cond_4
    invoke-static {p1, v6, v0}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v3

    .line 138
    :cond_5
    const-string p0, "Input is not in .Z format"

    .line 139
    .line 140
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v3
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lme5;->p:Lqs;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqs;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(IB)I
    .locals 5

    .line 1
    iget v0, p0, Lme5;->r:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int v2, v1, v0

    .line 5
    .line 6
    iget v3, p0, Lme5;->u:I

    .line 7
    .line 8
    if-ge v3, v2, :cond_0

    .line 9
    .line 10
    iget-object v4, p0, Lme5;->v:[I

    .line 11
    .line 12
    aput p1, v4, v3

    .line 13
    .line 14
    iget-object p1, p0, Lme5;->w:[B

    .line 15
    .line 16
    aput-byte p2, p1, v3

    .line 17
    .line 18
    add-int/lit8 p1, v3, 0x1

    .line 19
    .line 20
    iput p1, p0, Lme5;->u:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, -0x1

    .line 24
    :goto_0
    iget p1, p0, Lme5;->u:I

    .line 25
    .line 26
    if-ne p1, v2, :cond_1

    .line 27
    .line 28
    iget p1, p0, Lme5;->A:I

    .line 29
    .line 30
    if-ge v0, p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lme5;->j()V

    .line 33
    .line 34
    .line 35
    iget p1, p0, Lme5;->r:I

    .line 36
    .line 37
    add-int/2addr p1, v1

    .line 38
    iput p1, p0, Lme5;->r:I

    .line 39
    .line 40
    :cond_1
    return v3
.end method

.method public final j()V
    .locals 9

    .line 1
    iget-wide v0, p0, Lme5;->B:J

    .line 2
    .line 3
    const-wide/16 v2, 0x8

    .line 4
    .line 5
    rem-long/2addr v0, v2

    .line 6
    sub-long v0, v2, v0

    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move-wide v0, v3

    .line 15
    :cond_0
    move-wide v5, v3

    .line 16
    :goto_0
    cmp-long v2, v5, v0

    .line 17
    .line 18
    if-gez v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lme5;->n()I

    .line 21
    .line 22
    .line 23
    const-wide/16 v7, 0x1

    .line 24
    .line 25
    add-long/2addr v5, v7

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p0, p0, Lme5;->p:Lqs;

    .line 28
    .line 29
    iput-wide v3, p0, Lqs;->p:J

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput v0, p0, Lqs;->q:I

    .line 33
    .line 34
    return-void
.end method

.method public final n()I
    .locals 5

    .line 1
    iget v0, p0, Lme5;->r:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-gt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lme5;->p:Lqs;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lqs;->b(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    long-to-int v0, v0

    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    iget-wide v1, p0, Lme5;->B:J

    .line 17
    .line 18
    const-wide/16 v3, 0x1

    .line 19
    .line 20
    add-long/2addr v1, v3

    .line 21
    iput-wide v1, p0, Lme5;->B:J

    .line 22
    .line 23
    :cond_0
    return v0

    .line 24
    :cond_1
    const-string p0, "Code size must not be bigger than 31"

    .line 25
    .line 26
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final read()I
    .locals 1

    .line 197
    iget-object v0, p0, Lme5;->o:[B

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result p0

    if-gez p0, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    .line 198
    aget-byte p0, v0, p0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public final read([BII)I
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lme5;->x:[B

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    iget v3, p0, Lme5;->y:I

    .line 9
    .line 10
    sub-int/2addr v2, v3

    .line 11
    if-lez v2, :cond_1

    .line 12
    .line 13
    invoke-static {v2, p3}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget v3, p0, Lme5;->y:I

    .line 18
    .line 19
    invoke-static {v1, v3, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    iget v3, p0, Lme5;->y:I

    .line 23
    .line 24
    add-int/2addr v3, v2

    .line 25
    iput v3, p0, Lme5;->y:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v2, v0

    .line 29
    :goto_0
    sub-int v3, p3, v2

    .line 30
    .line 31
    if-lez v3, :cond_c

    .line 32
    .line 33
    invoke-virtual {p0}, Lme5;->n()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/4 v5, -0x1

    .line 38
    if-gez v4, :cond_2

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    iget-boolean v6, p0, Lme5;->z:Z

    .line 42
    .line 43
    if-eqz v6, :cond_3

    .line 44
    .line 45
    iget v7, p0, Lme5;->q:I

    .line 46
    .line 47
    if-ne v4, v7, :cond_3

    .line 48
    .line 49
    add-int/lit16 v6, v6, 0x100

    .line 50
    .line 51
    iput v6, p0, Lme5;->u:I

    .line 52
    .line 53
    invoke-virtual {p0}, Lme5;->j()V

    .line 54
    .line 55
    .line 56
    const/16 v4, 0x9

    .line 57
    .line 58
    iput v4, p0, Lme5;->r:I

    .line 59
    .line 60
    iput v5, p0, Lme5;->t:I

    .line 61
    .line 62
    move v5, v0

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    iget v6, p0, Lme5;->u:I

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    if-ne v4, v6, :cond_5

    .line 68
    .line 69
    iget v6, p0, Lme5;->t:I

    .line 70
    .line 71
    if-eq v6, v5, :cond_4

    .line 72
    .line 73
    iget-byte v8, p0, Lme5;->s:B

    .line 74
    .line 75
    invoke-virtual {p0, v6, v8}, Lme5;->f(IB)I

    .line 76
    .line 77
    .line 78
    move v6, v7

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    const-string p0, "The first code can\'t be a reference to its preceding code"

    .line 81
    .line 82
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return v0

    .line 86
    :cond_5
    if-gt v4, v6, :cond_b

    .line 87
    .line 88
    move v6, v0

    .line 89
    :goto_1
    move v8, v4

    .line 90
    :goto_2
    if-ltz v8, :cond_6

    .line 91
    .line 92
    iget v9, p0, Lme5;->y:I

    .line 93
    .line 94
    sub-int/2addr v9, v7

    .line 95
    iput v9, p0, Lme5;->y:I

    .line 96
    .line 97
    iget-object v10, p0, Lme5;->w:[B

    .line 98
    .line 99
    aget-byte v10, v10, v8

    .line 100
    .line 101
    aput-byte v10, v1, v9

    .line 102
    .line 103
    iget-object v9, p0, Lme5;->v:[I

    .line 104
    .line 105
    aget v8, v9, v8

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    iget v7, p0, Lme5;->t:I

    .line 109
    .line 110
    if-eq v7, v5, :cond_7

    .line 111
    .line 112
    if-nez v6, :cond_7

    .line 113
    .line 114
    iget v5, p0, Lme5;->y:I

    .line 115
    .line 116
    aget-byte v5, v1, v5

    .line 117
    .line 118
    invoke-virtual {p0, v7, v5}, Lme5;->f(IB)I

    .line 119
    .line 120
    .line 121
    :cond_7
    iput v4, p0, Lme5;->t:I

    .line 122
    .line 123
    iget v5, p0, Lme5;->y:I

    .line 124
    .line 125
    aget-byte v4, v1, v5

    .line 126
    .line 127
    iput-byte v4, p0, Lme5;->s:B

    .line 128
    .line 129
    :goto_3
    if-gez v5, :cond_9

    .line 130
    .line 131
    if-lez v2, :cond_8

    .line 132
    .line 133
    int-to-long p1, v2

    .line 134
    invoke-virtual {p0, p1, p2}, Li90;->b(J)V

    .line 135
    .line 136
    .line 137
    return v2

    .line 138
    :cond_8
    return v5

    .line 139
    :cond_9
    add-int v4, p2, v2

    .line 140
    .line 141
    array-length v5, v1

    .line 142
    iget v6, p0, Lme5;->y:I

    .line 143
    .line 144
    sub-int/2addr v5, v6

    .line 145
    if-lez v5, :cond_a

    .line 146
    .line 147
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    iget v5, p0, Lme5;->y:I

    .line 152
    .line 153
    invoke-static {v1, v5, p1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 154
    .line 155
    .line 156
    iget v4, p0, Lme5;->y:I

    .line 157
    .line 158
    add-int/2addr v4, v3

    .line 159
    iput v4, p0, Lme5;->y:I

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_a
    move v3, v0

    .line 163
    :goto_4
    add-int/2addr v2, v3

    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 167
    .line 168
    iget p0, p0, Lme5;->r:I

    .line 169
    .line 170
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    filled-new-array {p0, p2}, [Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    const-string p2, "Invalid %d bit code 0x%x"

    .line 183
    .line 184
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p1

    .line 192
    :cond_c
    int-to-long p1, v2

    .line 193
    invoke-virtual {p0, p1, p2}, Li90;->b(J)V

    .line 194
    .line 195
    .line 196
    return v2
.end method
