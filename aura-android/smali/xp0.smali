.class public final Lxp0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:[I

.field public final c:[I

.field public final d:Lzg5;

.field public final e:I

.field public final f:I

.field public final g:Z


# direct methods
.method public constructor <init>(Lzg5;Ljava/util/ArrayList;[I[I)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lxp0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p3, p0, Lxp0;->b:[I

    .line 7
    .line 8
    iput-object p4, p0, Lxp0;->c:[I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p3, v0}, Ljava/util/Arrays;->fill([II)V

    .line 12
    .line 13
    .line 14
    invoke-static {p4, v0}, Ljava/util/Arrays;->fill([II)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lxp0;->d:Lzg5;

    .line 18
    .line 19
    invoke-virtual {p1}, Lzg5;->u()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, p0, Lxp0;->e:I

    .line 24
    .line 25
    invoke-virtual {p1}, Lzg5;->t()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, p0, Lxp0;->f:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    iput-boolean v3, p0, Lxp0;->g:Z

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lwp0;

    .line 47
    .line 48
    :goto_0
    if-eqz v4, :cond_1

    .line 49
    .line 50
    iget v5, v4, Lwp0;->a:I

    .line 51
    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    iget v4, v4, Lwp0;->b:I

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    :cond_1
    new-instance v4, Lwp0;

    .line 59
    .line 60
    invoke-direct {v4, v0, v0, v0}, Lwp0;-><init>(III)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v0, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    new-instance v4, Lwp0;

    .line 67
    .line 68
    invoke-direct {v4, v1, v2, v0}, Lwp0;-><init>(III)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    move v2, v0

    .line 79
    :cond_3
    if-ge v2, v1, :cond_5

    .line 80
    .line 81
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    check-cast v4, Lwp0;

    .line 88
    .line 89
    move v5, v0

    .line 90
    :goto_1
    iget v6, v4, Lwp0;->c:I

    .line 91
    .line 92
    if-ge v5, v6, :cond_3

    .line 93
    .line 94
    iget v6, v4, Lwp0;->a:I

    .line 95
    .line 96
    add-int/2addr v6, v5

    .line 97
    iget v7, v4, Lwp0;->b:I

    .line 98
    .line 99
    add-int/2addr v7, v5

    .line 100
    invoke-virtual {p1, v6, v7}, Lzg5;->l(II)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_4

    .line 105
    .line 106
    move v8, v3

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    const/4 v8, 0x2

    .line 109
    :goto_2
    shl-int/lit8 v9, v7, 0x4

    .line 110
    .line 111
    or-int/2addr v9, v8

    .line 112
    aput v9, p3, v6

    .line 113
    .line 114
    shl-int/lit8 v6, v6, 0x4

    .line 115
    .line 116
    or-int/2addr v6, v8

    .line 117
    aput v6, p4, v7

    .line 118
    .line 119
    add-int/lit8 v5, v5, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    iget-boolean p0, p0, Lxp0;->g:Z

    .line 123
    .line 124
    if-eqz p0, :cond_b

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    move v1, v0

    .line 131
    move v2, v1

    .line 132
    :goto_3
    if-ge v2, p0, :cond_b

    .line 133
    .line 134
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    check-cast v3, Lwp0;

    .line 141
    .line 142
    :goto_4
    iget v4, v3, Lwp0;->a:I

    .line 143
    .line 144
    if-ge v1, v4, :cond_a

    .line 145
    .line 146
    aget v4, p3, v1

    .line 147
    .line 148
    if-nez v4, :cond_9

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    move v5, v0

    .line 155
    move v6, v5

    .line 156
    :goto_5
    if-ge v5, v4, :cond_9

    .line 157
    .line 158
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    check-cast v7, Lwp0;

    .line 163
    .line 164
    :goto_6
    iget v8, v7, Lwp0;->b:I

    .line 165
    .line 166
    if-ge v6, v8, :cond_8

    .line 167
    .line 168
    aget v8, p4, v6

    .line 169
    .line 170
    if-nez v8, :cond_7

    .line 171
    .line 172
    invoke-virtual {p1, v1, v6}, Lzg5;->m(II)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-eqz v8, :cond_7

    .line 177
    .line 178
    invoke-virtual {p1, v1, v6}, Lzg5;->l(II)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_6

    .line 183
    .line 184
    const/16 v4, 0x8

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_6
    const/4 v4, 0x4

    .line 188
    :goto_7
    shl-int/lit8 v5, v6, 0x4

    .line 189
    .line 190
    or-int/2addr v5, v4

    .line 191
    aput v5, p3, v1

    .line 192
    .line 193
    shl-int/lit8 v5, v1, 0x4

    .line 194
    .line 195
    or-int/2addr v4, v5

    .line 196
    aput v4, p4, v6

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_8
    iget v6, v7, Lwp0;->c:I

    .line 203
    .line 204
    add-int/2addr v6, v8

    .line 205
    add-int/lit8 v5, v5, 0x1

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_9
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_a
    iget v1, v3, Lwp0;->c:I

    .line 212
    .line 213
    add-int/2addr v1, v4

    .line 214
    goto :goto_3

    .line 215
    :cond_b
    return-void
.end method

.method public static a(Ljava/util/ArrayDeque;IZ)Lyp0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lyp0;

    .line 16
    .line 17
    iget v1, v0, Lyp0;->a:I

    .line 18
    .line 19
    if-ne v1, p1, :cond_0

    .line 20
    .line 21
    iget-boolean v1, v0, Lyp0;->c:Z

    .line 22
    .line 23
    if-ne v1, p2, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lyp0;

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    iget v1, p1, Lyp0;->b:I

    .line 45
    .line 46
    add-int/lit8 v1, v1, -0x1

    .line 47
    .line 48
    iput v1, p1, Lyp0;->b:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget v1, p1, Lyp0;->b:I

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    iput v1, p1, Lyp0;->b:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    return-object v0
.end method
