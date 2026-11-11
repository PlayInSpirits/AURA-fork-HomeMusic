.class public final Lln0;
.super Lnn0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final A:Z

.field public final r:I

.field public final s:Z

.field public final t:Z

.field public final u:Z

.field public final v:I

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(ILsv4;ILjn0;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lnn0;-><init>(ILsv4;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p5, p1}, Lkq;->n(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iput-boolean p2, p0, Lln0;->s:Z

    .line 10
    .line 11
    iget-object p2, p0, Lnn0;->q:Ltb1;

    .line 12
    .line 13
    iget p2, p2, Ltb1;->e:I

    .line 14
    .line 15
    iget p3, p4, Lcw4;->C:I

    .line 16
    .line 17
    iget-object v0, p4, Lcw4;->y:Lyw1;

    .line 18
    .line 19
    not-int p3, p3

    .line 20
    and-int/2addr p2, p3

    .line 21
    and-int/lit8 p3, p2, 0x1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    move p3, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p3, p1

    .line 29
    :goto_0
    iput-boolean p3, p0, Lln0;->t:Z

    .line 30
    .line 31
    and-int/lit8 p2, p2, 0x2

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    move p2, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move p2, p1

    .line 38
    :goto_1
    iput-boolean p2, p0, Lln0;->u:Z

    .line 39
    .line 40
    if-eqz p7, :cond_2

    .line 41
    .line 42
    invoke-static {p7}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    const-string p2, ""

    .line 54
    .line 55
    invoke-static {p2}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move-object p2, v0

    .line 61
    :goto_2
    move p3, p1

    .line 62
    :goto_3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const v3, 0x7fffffff

    .line 67
    .line 68
    .line 69
    if-ge p3, v2, :cond_5

    .line 70
    .line 71
    iget-object v2, p0, Lnn0;->q:Ltb1;

    .line 72
    .line 73
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/String;

    .line 78
    .line 79
    iget-boolean v5, p4, Lcw4;->D:Z

    .line 80
    .line 81
    invoke-static {v2, v4, v5}, Lpn0;->c(Ltb1;Ljava/lang/String;Z)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-lez v2, :cond_4

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_4
    add-int/lit8 p3, p3, 0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    move v2, p1

    .line 92
    move p3, v3

    .line 93
    :goto_4
    iput p3, p0, Lln0;->v:I

    .line 94
    .line 95
    iput v2, p0, Lln0;->w:I

    .line 96
    .line 97
    const/16 p2, 0x440

    .line 98
    .line 99
    if-eqz p7, :cond_6

    .line 100
    .line 101
    move p3, p2

    .line 102
    goto :goto_5

    .line 103
    :cond_6
    iget p3, p4, Lcw4;->A:I

    .line 104
    .line 105
    :goto_5
    iget-object p7, p0, Lnn0;->q:Ltb1;

    .line 106
    .line 107
    iget p7, p7, Ltb1;->f:I

    .line 108
    .line 109
    sget-object v4, Lpn0;->k:Lgb3;

    .line 110
    .line 111
    if-eqz p7, :cond_7

    .line 112
    .line 113
    if-ne p7, p3, :cond_7

    .line 114
    .line 115
    move p3, v3

    .line 116
    goto :goto_6

    .line 117
    :cond_7
    and-int/2addr p3, p7

    .line 118
    invoke-static {p3}, Ljava/lang/Integer;->bitCount(I)I

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    :goto_6
    iput p3, p0, Lln0;->x:I

    .line 123
    .line 124
    iget-object p7, p0, Lnn0;->q:Ltb1;

    .line 125
    .line 126
    iget v4, p7, Ltb1;->f:I

    .line 127
    .line 128
    and-int/2addr p2, v4

    .line 129
    if-eqz p2, :cond_8

    .line 130
    .line 131
    move p2, v1

    .line 132
    goto :goto_7

    .line 133
    :cond_8
    move p2, p1

    .line 134
    :goto_7
    iput-boolean p2, p0, Lln0;->A:Z

    .line 135
    .line 136
    iget-object p2, p4, Lcw4;->z:Lyw1;

    .line 137
    .line 138
    invoke-static {p7, p2}, Lpn0;->a(Ltb1;Lyw1;)I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    iput p2, p0, Lln0;->y:I

    .line 143
    .line 144
    invoke-static {p6}, Lpn0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p7

    .line 148
    if-nez p7, :cond_9

    .line 149
    .line 150
    move p7, v1

    .line 151
    goto :goto_8

    .line 152
    :cond_9
    move p7, p1

    .line 153
    :goto_8
    iget-object v4, p0, Lnn0;->q:Ltb1;

    .line 154
    .line 155
    invoke-static {v4, p6, p7}, Lpn0;->c(Ltb1;Ljava/lang/String;Z)I

    .line 156
    .line 157
    .line 158
    move-result p6

    .line 159
    iput p6, p0, Lln0;->z:I

    .line 160
    .line 161
    if-gtz v2, :cond_e

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result p7

    .line 167
    if-eqz p7, :cond_a

    .line 168
    .line 169
    if-gtz p3, :cond_e

    .line 170
    .line 171
    :cond_a
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result p3

    .line 175
    if-eqz p3, :cond_b

    .line 176
    .line 177
    if-ne p2, v3, :cond_e

    .line 178
    .line 179
    :cond_b
    iget-boolean p2, p0, Lln0;->t:Z

    .line 180
    .line 181
    if-nez p2, :cond_e

    .line 182
    .line 183
    iget-boolean p2, p0, Lln0;->u:Z

    .line 184
    .line 185
    if-eqz p2, :cond_c

    .line 186
    .line 187
    if-gtz p6, :cond_e

    .line 188
    .line 189
    :cond_c
    iget-boolean p2, p4, Lcw4;->x:Z

    .line 190
    .line 191
    if-eqz p2, :cond_d

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_d
    move p2, p1

    .line 195
    goto :goto_a

    .line 196
    :cond_e
    :goto_9
    move p2, v1

    .line 197
    :goto_a
    iget-boolean p3, p4, Ljn0;->B0:Z

    .line 198
    .line 199
    invoke-static {p5, p3}, Lkq;->n(IZ)Z

    .line 200
    .line 201
    .line 202
    move-result p3

    .line 203
    if-eqz p3, :cond_f

    .line 204
    .line 205
    if-eqz p2, :cond_f

    .line 206
    .line 207
    move p1, v1

    .line 208
    :cond_f
    iput p1, p0, Lln0;->r:I

    .line 209
    .line 210
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lln0;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic b(Lnn0;)Z
    .locals 0

    .line 1
    check-cast p1, Lln0;

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0
.end method

.method public final c(Lln0;)I
    .locals 7

    .line 1
    iget-boolean v0, p0, Lln0;->s:Z

    .line 2
    .line 3
    iget-boolean v1, p1, Lln0;->s:Z

    .line 4
    .line 5
    sget-object v2, Lv60;->a:Lt60;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Lt60;->c(ZZ)Lv60;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lln0;->v:I

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p1, Lln0;->v:I

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lx13;->o:Lx13;

    .line 24
    .line 25
    sget-object v4, Lx13;->p:Lx13;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v4}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v1, p1, Lln0;->w:I

    .line 32
    .line 33
    iget v2, p0, Lln0;->w:I

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lv60;->a(II)Lv60;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget v1, p1, Lln0;->x:I

    .line 40
    .line 41
    iget v5, p0, Lln0;->x:I

    .line 42
    .line 43
    invoke-virtual {v0, v5, v1}, Lv60;->a(II)Lv60;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget v1, p0, Lln0;->y:I

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget v6, p1, Lln0;->y:I

    .line 54
    .line 55
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v0, v1, v6, v4}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-boolean v1, p0, Lln0;->t:Z

    .line 64
    .line 65
    iget-boolean v6, p1, Lln0;->t:Z

    .line 66
    .line 67
    invoke-virtual {v0, v1, v6}, Lv60;->c(ZZ)Lv60;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-boolean v1, p0, Lln0;->u:Z

    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-boolean v6, p1, Lln0;->u:Z

    .line 78
    .line 79
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    if-nez v2, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    move-object v3, v4

    .line 87
    :goto_0
    invoke-virtual {v0, v1, v6, v3}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget v1, p0, Lln0;->z:I

    .line 92
    .line 93
    iget v2, p1, Lln0;->z:I

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Lv60;->a(II)Lv60;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-nez v5, :cond_1

    .line 100
    .line 101
    iget-boolean p0, p0, Lln0;->A:Z

    .line 102
    .line 103
    iget-boolean p1, p1, Lln0;->A:Z

    .line 104
    .line 105
    invoke-virtual {v0, p0, p1}, Lv60;->d(ZZ)Lv60;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_1
    invoke-virtual {v0}, Lv60;->e()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    return p0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lln0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lln0;->c(Lln0;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
