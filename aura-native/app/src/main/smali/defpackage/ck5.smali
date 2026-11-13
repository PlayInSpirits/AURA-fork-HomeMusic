.class public final Ldefpackage/ck5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final n:Ljava/io/ByteArrayInputStream;

.field public o:Ldefpackage/bk5;

.field public final p:[B

.field public final q:Ldefpackage/qw;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Ldefpackage/ck5;->p:[B

    .line 9
    .line 10
    new-instance v0, Ldefpackage/qw;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, Ldefpackage/qw;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldefpackage/ck5;->q:Ldefpackage/qw;

    .line 17
    .line 18
    iput-object p1, p0, Ldefpackage/ck5;->n:Ljava/io/ByteArrayInputStream;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final F(I[B)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-eq v0, p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/ck5;->n:Ljava/io/ByteArrayInputStream;

    .line 5
    .line 6
    sub-int v2, p1, v0

    .line 7
    .line 8
    invoke-virtual {v1, p2, v0, v2}, Ljava/io/InputStream;->read([BII)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 25
    .line 26
    return-void
.end method

.method public final H()[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/ck5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/ck5;->s()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-ltz v2, :cond_1

    .line 13
    .line 14
    const-wide/32 v2, 0x7fffffff

    .line 15
    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-gtz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Ldefpackage/ck5;->n:Ljava/io/ByteArrayInputStream;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    int-to-long v2, v2

    .line 28
    cmp-long v2, v2, v0

    .line 29
    .line 30
    if-ltz v2, :cond_0

    .line 31
    .line 32
    long-to-int v0, v0

    .line 33
    new-array v1, v0, [B

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ldefpackage/ck5;->F(I[B)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_1
    const-string p0, "the maximum supported byte/text string length is 2147483647 bytes"

    .line 46
    .line 47
    invoke-static {p0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public final b()J
    .locals 5

    .line 1
    const/16 v0, -0x80

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/ck5;->v(B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/ck5;->u()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/ck5;->s()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-ltz v4, :cond_1

    .line 18
    .line 19
    if-lez v4, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/ck5;->q:Ldefpackage/qw;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/qw;->a:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-wide v0

    .line 33
    :cond_1
    const-string p0, "the maximum supported array length is 9223372036854775807"

    .line 34
    .line 35
    invoke-static {p0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-wide v2
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ck5;->n:Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ck5;->q:Ldefpackage/qw;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/qw;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/ck5;->n()Ldefpackage/bk5;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 5
    .line 6
    iget-byte v0, v0, Ldefpackage/bk5;->a:B

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v1, 0x20

    .line 13
    .line 14
    if-ne v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, Ldefpackage/ck5;->s()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long p0, v1, v3

    .line 24
    .line 25
    if-ltz p0, :cond_2

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return-wide v1

    .line 30
    :cond_1
    not-long v0, v1

    .line 31
    return-wide v0

    .line 32
    :cond_2
    const-string p0, "the maximum supported unsigned/negative integer is 9223372036854775807"

    .line 33
    .line 34
    invoke-static {p0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    const-wide/16 v0, 0x0

    .line 38
    .line 39
    return-wide v0

    .line 40
    :cond_3
    shr-int/lit8 p0, v0, 0x5

    .line 41
    .line 42
    and-int/lit8 p0, p0, 0x7

    .line 43
    .line 44
    const-string v0, "expected major type 0 or 1 but found "

    .line 45
    .line 46
    invoke-static {p0, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1
.end method

.method public final j()J
    .locals 7

    .line 1
    const/16 v0, -0x60

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/ck5;->v(B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/ck5;->u()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/ck5;->s()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-ltz v4, :cond_1

    .line 18
    .line 19
    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v5, v0, v5

    .line 25
    .line 26
    if-gtz v5, :cond_1

    .line 27
    .line 28
    if-lez v4, :cond_0

    .line 29
    .line 30
    add-long v2, v0, v0

    .line 31
    .line 32
    iget-object p0, p0, Ldefpackage/ck5;->q:Ldefpackage/qw;

    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/qw;->a:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-wide v0

    .line 44
    :cond_1
    const-string p0, "the maximum supported map length is 4611686018427387903L"

    .line 45
    .line 46
    invoke-static {p0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-wide v2
.end method

.method public final n()Ldefpackage/bk5;
    .locals 11

    .line 1
    iget-object v0, p0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/ck5;->n:Ljava/io/ByteArrayInputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v3, p0, Ldefpackage/ck5;->q:Ldefpackage/qw;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3}, Ldefpackage/qw;->b()V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_0
    new-instance v1, Ldefpackage/bk5;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Ldefpackage/bk5;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 27
    .line 28
    const/16 v0, -0x80

    .line 29
    .line 30
    const-wide/16 v4, -0x5

    .line 31
    .line 32
    const-wide/16 v6, -0x2

    .line 33
    .line 34
    const-wide/16 v8, -0x1

    .line 35
    .line 36
    iget-byte v10, v1, Ldefpackage/bk5;->a:B

    .line 37
    .line 38
    if-eq v10, v0, :cond_6

    .line 39
    .line 40
    const/16 v0, -0x60

    .line 41
    .line 42
    if-eq v10, v0, :cond_6

    .line 43
    .line 44
    const/16 v0, -0x40

    .line 45
    .line 46
    if-eq v10, v0, :cond_6

    .line 47
    .line 48
    const/16 v0, -0x20

    .line 49
    .line 50
    if-eq v10, v0, :cond_3

    .line 51
    .line 52
    if-eqz v10, :cond_6

    .line 53
    .line 54
    const/16 v0, 0x20

    .line 55
    .line 56
    if-eq v10, v0, :cond_6

    .line 57
    .line 58
    const/16 v0, 0x40

    .line 59
    .line 60
    if-eq v10, v0, :cond_2

    .line 61
    .line 62
    const/16 v0, 0x60

    .line 63
    .line 64
    if-ne v10, v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {v3, v6, v7}, Ldefpackage/qw;->c(J)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    shr-int/lit8 p0, v10, 0x5

    .line 71
    .line 72
    and-int/lit8 p0, p0, 0x7

    .line 73
    .line 74
    const-string v0, "invalid major type: "

    .line 75
    .line 76
    invoke-static {p0, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_2
    invoke-virtual {v3, v8, v9}, Ldefpackage/qw;->c(J)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    iget-byte v0, v1, Ldefpackage/bk5;->b:B

    .line 89
    .line 90
    const/16 v1, 0x1f

    .line 91
    .line 92
    if-ne v0, v1, :cond_6

    .line 93
    .line 94
    invoke-virtual {v3}, Ldefpackage/qw;->d()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    const-wide/16 v6, 0x0

    .line 99
    .line 100
    cmp-long v6, v0, v6

    .line 101
    .line 102
    if-gez v6, :cond_5

    .line 103
    .line 104
    cmp-long v0, v0, v4

    .line 105
    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    iget-object v0, v3, Ldefpackage/qw;->a:Ljava/util/ArrayDeque;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    const-string p0, "expected a value for dangling key in indefinite-length map"

    .line 115
    .line 116
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-object v2

    .line 120
    :cond_5
    const-string p0, "expected indefinite length scope but found "

    .line 121
    .line 122
    invoke-static {p0, v0, v1}, Ldefpackage/b11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v2

    .line 130
    :cond_6
    invoke-virtual {v3}, Ldefpackage/qw;->d()J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    cmp-long v10, v0, v8

    .line 135
    .line 136
    if-eqz v10, :cond_a

    .line 137
    .line 138
    cmp-long v0, v0, v6

    .line 139
    .line 140
    if-eqz v0, :cond_b

    .line 141
    .line 142
    :goto_0
    invoke-virtual {v3}, Ldefpackage/qw;->d()J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    iget-object v2, v3, Ldefpackage/qw;->a:Ljava/util/ArrayDeque;

    .line 147
    .line 148
    const-wide/16 v6, 0x1

    .line 149
    .line 150
    cmp-long v3, v0, v6

    .line 151
    .line 152
    if-nez v3, :cond_7

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_7
    if-lez v3, :cond_8

    .line 159
    .line 160
    add-long/2addr v0, v8

    .line 161
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_8
    const-wide/16 v6, -0x4

    .line 173
    .line 174
    cmp-long v3, v0, v6

    .line 175
    .line 176
    if-nez v3, :cond_9

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_9
    cmp-long v0, v0, v4

    .line 190
    .line 191
    if-nez v0, :cond_c

    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_a
    move-wide v6, v0

    .line 205
    :cond_b
    const-string p0, "expected non-string scope but found "

    .line 206
    .line 207
    invoke-static {p0, v6, v7}, Ldefpackage/b11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-object v2

    .line 215
    :cond_c
    :goto_1
    iget-object p0, p0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 216
    .line 217
    return-object p0
.end method

.method public final q()Z
    .locals 2

    .line 1
    const/16 v0, -0x20

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/ck5;->v(B)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 7
    .line 8
    iget-byte v0, v0, Ldefpackage/bk5;->b:B

    .line 9
    .line 10
    const/16 v1, 0x18

    .line 11
    .line 12
    if-gt v0, v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/ck5;->s()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-int p0, v0

    .line 19
    const/16 v0, 0x14

    .line 20
    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_0
    const/16 v0, 0x15

    .line 26
    .line 27
    if-ne p0, v0, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const-string p0, "expected FALSE or TRUE"

    .line 32
    .line 33
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_2
    const-string p0, "expected simple value"

    .line 39
    .line 40
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0
.end method

.method public final s()J
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 4
    .line 5
    iget-byte v2, v1, Ldefpackage/bk5;->b:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x18

    .line 9
    .line 10
    if-ge v2, v4, :cond_0

    .line 11
    .line 12
    int-to-long v1, v2

    .line 13
    iput-object v3, v0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 14
    .line 15
    return-wide v1

    .line 16
    :cond_0
    const-wide/16 v5, 0xff

    .line 17
    .line 18
    if-ne v2, v4, :cond_2

    .line 19
    .line 20
    iget-object v1, v0, Ldefpackage/ck5;->n:Ljava/io/ByteArrayInputStream;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    iput-object v3, v0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 30
    .line 31
    int-to-long v0, v1

    .line 32
    and-long/2addr v0, v5

    .line 33
    return-wide v0

    .line 34
    :cond_1
    new-instance v0, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_2
    const/16 v3, 0x19

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x2

    .line 45
    const/16 v10, 0x8

    .line 46
    .line 47
    iget-object v11, v0, Ldefpackage/ck5;->p:[B

    .line 48
    .line 49
    if-ne v2, v3, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0, v9, v11}, Ldefpackage/ck5;->F(I[B)V

    .line 52
    .line 53
    .line 54
    aget-byte v0, v11, v8

    .line 55
    .line 56
    int-to-long v0, v0

    .line 57
    aget-byte v2, v11, v7

    .line 58
    .line 59
    int-to-long v2, v2

    .line 60
    and-long/2addr v0, v5

    .line 61
    shl-long/2addr v0, v10

    .line 62
    and-long/2addr v2, v5

    .line 63
    or-long/2addr v0, v2

    .line 64
    return-wide v0

    .line 65
    :cond_3
    const/16 v3, 0x1a

    .line 66
    .line 67
    const/16 v12, 0x10

    .line 68
    .line 69
    const/4 v13, 0x3

    .line 70
    const/4 v14, 0x4

    .line 71
    if-ne v2, v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0, v14, v11}, Ldefpackage/ck5;->F(I[B)V

    .line 74
    .line 75
    .line 76
    aget-byte v0, v11, v8

    .line 77
    .line 78
    int-to-long v0, v0

    .line 79
    aget-byte v2, v11, v7

    .line 80
    .line 81
    int-to-long v2, v2

    .line 82
    aget-byte v7, v11, v9

    .line 83
    .line 84
    int-to-long v7, v7

    .line 85
    aget-byte v9, v11, v13

    .line 86
    .line 87
    int-to-long v13, v9

    .line 88
    and-long/2addr v0, v5

    .line 89
    shl-long/2addr v0, v4

    .line 90
    and-long/2addr v2, v5

    .line 91
    and-long/2addr v7, v5

    .line 92
    shl-long/2addr v2, v12

    .line 93
    or-long/2addr v0, v2

    .line 94
    shl-long v2, v7, v10

    .line 95
    .line 96
    or-long/2addr v0, v2

    .line 97
    and-long v2, v13, v5

    .line 98
    .line 99
    or-long/2addr v0, v2

    .line 100
    return-wide v0

    .line 101
    :cond_4
    const/16 v3, 0x1b

    .line 102
    .line 103
    const/16 v16, 0x5

    .line 104
    .line 105
    if-ne v2, v3, :cond_5

    .line 106
    .line 107
    invoke-virtual {v0, v10, v11}, Ldefpackage/ck5;->F(I[B)V

    .line 108
    .line 109
    .line 110
    aget-byte v0, v11, v8

    .line 111
    .line 112
    int-to-long v0, v0

    .line 113
    aget-byte v2, v11, v7

    .line 114
    .line 115
    int-to-long v2, v2

    .line 116
    aget-byte v7, v11, v9

    .line 117
    .line 118
    int-to-long v7, v7

    .line 119
    aget-byte v9, v11, v13

    .line 120
    .line 121
    move v13, v4

    .line 122
    move-wide/from16 v17, v5

    .line 123
    .line 124
    int-to-long v4, v9

    .line 125
    aget-byte v6, v11, v14

    .line 126
    .line 127
    move v14, v10

    .line 128
    move-object v9, v11

    .line 129
    int-to-long v10, v6

    .line 130
    aget-byte v6, v9, v16

    .line 131
    .line 132
    move/from16 v19, v12

    .line 133
    .line 134
    move/from16 p0, v13

    .line 135
    .line 136
    int-to-long v12, v6

    .line 137
    const/4 v6, 0x6

    .line 138
    aget-byte v6, v9, v6

    .line 139
    .line 140
    move/from16 v21, v14

    .line 141
    .line 142
    const/16 v20, 0x7

    .line 143
    .line 144
    int-to-long v14, v6

    .line 145
    aget-byte v6, v9, v20

    .line 146
    .line 147
    move-wide/from16 v22, v0

    .line 148
    .line 149
    int-to-long v0, v6

    .line 150
    and-long v9, v10, v17

    .line 151
    .line 152
    shl-long v9, v9, p0

    .line 153
    .line 154
    and-long v22, v22, v17

    .line 155
    .line 156
    and-long v2, v2, v17

    .line 157
    .line 158
    and-long v6, v7, v17

    .line 159
    .line 160
    and-long v4, v4, v17

    .line 161
    .line 162
    and-long v11, v12, v17

    .line 163
    .line 164
    and-long v13, v14, v17

    .line 165
    .line 166
    const/16 v8, 0x38

    .line 167
    .line 168
    shl-long v15, v22, v8

    .line 169
    .line 170
    const/16 v8, 0x30

    .line 171
    .line 172
    shl-long/2addr v2, v8

    .line 173
    or-long/2addr v2, v15

    .line 174
    const/16 v8, 0x28

    .line 175
    .line 176
    shl-long/2addr v6, v8

    .line 177
    or-long/2addr v2, v6

    .line 178
    const/16 v6, 0x20

    .line 179
    .line 180
    shl-long/2addr v4, v6

    .line 181
    or-long/2addr v2, v4

    .line 182
    or-long/2addr v2, v9

    .line 183
    shl-long v4, v11, v19

    .line 184
    .line 185
    or-long/2addr v2, v4

    .line 186
    shl-long v4, v13, v21

    .line 187
    .line 188
    or-long/2addr v2, v4

    .line 189
    and-long v0, v0, v17

    .line 190
    .line 191
    or-long/2addr v0, v2

    .line 192
    return-wide v0

    .line 193
    :cond_5
    const/16 v20, 0x7

    .line 194
    .line 195
    iget-byte v0, v1, Ldefpackage/bk5;->a:B

    .line 196
    .line 197
    shr-int/lit8 v0, v0, 0x5

    .line 198
    .line 199
    and-int/lit8 v0, v0, 0x7

    .line 200
    .line 201
    const-string v1, "invalid additional information "

    .line 202
    .line 203
    const-string v3, " for major type "

    .line 204
    .line 205
    invoke-static {v2, v0, v1, v3}, Ldefpackage/xa3;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const-wide/16 v0, 0x0

    .line 213
    .line 214
    return-wide v0
.end method

.method public final u()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/ck5;->n()Ldefpackage/bk5;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 5
    .line 6
    iget-byte p0, p0, Ldefpackage/bk5;->b:B

    .line 7
    .line 8
    const/16 v0, 0x1f

    .line 9
    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "expected definite length but found "

    .line 14
    .line 15
    invoke-static {p0, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final v(B)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/ck5;->n()Ldefpackage/bk5;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/ck5;->o:Ldefpackage/bk5;

    .line 5
    .line 6
    iget-byte p0, p0, Ldefpackage/bk5;->a:B

    .line 7
    .line 8
    if-ne p0, p1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    shr-int/lit8 p1, p1, 0x5

    .line 12
    .line 13
    and-int/lit8 p1, p1, 0x7

    .line 14
    .line 15
    shr-int/lit8 p0, p0, 0x5

    .line 16
    .line 17
    and-int/lit8 p0, p0, 0x7

    .line 18
    .line 19
    const-string v0, "expected major type "

    .line 20
    .line 21
    const-string v1, " but found "

    .line 22
    .line 23
    invoke-static {p1, p0, v0, v1}, Ldefpackage/xa3;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
