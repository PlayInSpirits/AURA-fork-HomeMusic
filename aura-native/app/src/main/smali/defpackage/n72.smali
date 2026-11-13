.class public final Ldefpackage/n72;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/jn4;


# instance fields
.field public final a:Ldefpackage/j03;

.field public final synthetic b:Ldefpackage/o72;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/o72;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/n72;->b:Ldefpackage/o72;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/n72;->c:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object p1, Ldefpackage/m02;->a:[I

    .line 9
    .line 10
    new-instance p1, Ldefpackage/j03;

    .line 11
    .line 12
    invoke-direct {p1}, Ldefpackage/j03;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/n72;->a:Ldefpackage/j03;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/n72;->b:Ldefpackage/o72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/n72;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0, p0}, Ldefpackage/o72;->c(Ldefpackage/o72;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(Ldefpackage/ea;)V
    .locals 11

    .line 1
    iget-object v0, p0, Ldefpackage/n72;->b:Ldefpackage/o72;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/o72;->w:Ldefpackage/w03;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/n72;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ldefpackage/c72;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ldefpackage/cx2;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p0, v0

    .line 26
    :goto_0
    if-eqz p0, :cond_f

    .line 27
    .line 28
    iget-boolean v1, p0, Ldefpackage/cx2;->A:Z

    .line 29
    .line 30
    if-eqz v1, :cond_f

    .line 31
    .line 32
    iget-object v1, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 33
    .line 34
    iget-boolean v1, v1, Ldefpackage/cx2;->A:Z

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    const-string v1, "visitSubtreeIf called on an unattached node"

    .line 39
    .line 40
    invoke-static {v1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    new-instance v1, Ldefpackage/f13;

    .line 44
    .line 45
    const/16 v2, 0x10

    .line 46
    .line 47
    new-array v3, v2, [Ldefpackage/cx2;

    .line 48
    .line 49
    invoke-direct {v1, v3}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 53
    .line 54
    iget-object v3, p0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 55
    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    invoke-static {v1, p0}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {v1, v3}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    iget p0, v1, Ldefpackage/f13;->p:I

    .line 66
    .line 67
    if-eqz p0, :cond_f

    .line 68
    .line 69
    add-int/lit8 p0, p0, -0x1

    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Ldefpackage/cx2;

    .line 76
    .line 77
    iget v3, p0, Ldefpackage/cx2;->q:I

    .line 78
    .line 79
    const/high16 v4, 0x40000

    .line 80
    .line 81
    and-int/2addr v3, v4

    .line 82
    if-eqz v3, :cond_e

    .line 83
    .line 84
    move-object v3, p0

    .line 85
    :goto_2
    if-eqz v3, :cond_e

    .line 86
    .line 87
    iget-boolean v5, v3, Ldefpackage/cx2;->A:Z

    .line 88
    .line 89
    if-eqz v5, :cond_e

    .line 90
    .line 91
    iget v5, v3, Ldefpackage/cx2;->p:I

    .line 92
    .line 93
    and-int/2addr v5, v4

    .line 94
    if-eqz v5, :cond_d

    .line 95
    .line 96
    move-object v6, v0

    .line 97
    move-object v5, v3

    .line 98
    :goto_3
    if-eqz v5, :cond_d

    .line 99
    .line 100
    instance-of v7, v5, Ldefpackage/rx4;

    .line 101
    .line 102
    if-eqz v7, :cond_6

    .line 103
    .line 104
    check-cast v5, Ldefpackage/rx4;

    .line 105
    .line 106
    invoke-interface {v5}, Ldefpackage/rx4;->f()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    const-string v8, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    .line 111
    .line 112
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    sget-object v8, Ldefpackage/qx4;->o:Ldefpackage/qx4;

    .line 117
    .line 118
    if-eqz v7, :cond_4

    .line 119
    .line 120
    invoke-virtual {p1, v5}, Ldefpackage/ea;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-object v5, v8

    .line 124
    goto :goto_4

    .line 125
    :cond_4
    sget-object v5, Ldefpackage/qx4;->n:Ldefpackage/qx4;

    .line 126
    .line 127
    :goto_4
    sget-object v7, Ldefpackage/qx4;->p:Ldefpackage/qx4;

    .line 128
    .line 129
    if-ne v5, v7, :cond_5

    .line 130
    .line 131
    goto :goto_8

    .line 132
    :cond_5
    if-eq v5, v8, :cond_3

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_6
    iget v7, v5, Ldefpackage/cx2;->p:I

    .line 136
    .line 137
    and-int/2addr v7, v4

    .line 138
    if-eqz v7, :cond_c

    .line 139
    .line 140
    instance-of v7, v5, Ldefpackage/fo0;

    .line 141
    .line 142
    if-eqz v7, :cond_c

    .line 143
    .line 144
    move-object v7, v5

    .line 145
    check-cast v7, Ldefpackage/fo0;

    .line 146
    .line 147
    iget-object v7, v7, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 148
    .line 149
    const/4 v8, 0x0

    .line 150
    :goto_5
    const/4 v9, 0x1

    .line 151
    if-eqz v7, :cond_b

    .line 152
    .line 153
    iget v10, v7, Ldefpackage/cx2;->p:I

    .line 154
    .line 155
    and-int/2addr v10, v4

    .line 156
    if-eqz v10, :cond_a

    .line 157
    .line 158
    add-int/lit8 v8, v8, 0x1

    .line 159
    .line 160
    if-ne v8, v9, :cond_7

    .line 161
    .line 162
    move-object v5, v7

    .line 163
    goto :goto_6

    .line 164
    :cond_7
    if-nez v6, :cond_8

    .line 165
    .line 166
    new-instance v6, Ldefpackage/f13;

    .line 167
    .line 168
    new-array v9, v2, [Ldefpackage/cx2;

    .line 169
    .line 170
    invoke-direct {v6, v9}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    if-eqz v5, :cond_9

    .line 174
    .line 175
    invoke-virtual {v6, v5}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    move-object v5, v0

    .line 179
    :cond_9
    invoke-virtual {v6, v7}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_a
    :goto_6
    iget-object v7, v7, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_b
    if-ne v8, v9, :cond_c

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_c
    :goto_7
    invoke-static {v6}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    goto :goto_3

    .line 193
    :cond_d
    iget-object v3, v3, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_e
    invoke-static {v1, p0}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :cond_f
    :goto_8
    return-void
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/n72;->b:Ldefpackage/o72;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/o72;->w:Ldefpackage/w03;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/n72;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ldefpackage/c72;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ldefpackage/c13;

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/c13;->n:Ldefpackage/f13;

    .line 22
    .line 23
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 24
    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final d(IJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/n72;->b:Ldefpackage/o72;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/o72;->w:Ldefpackage/w03;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/n72;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ldefpackage/c72;

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-virtual {v1}, Ldefpackage/c72;->G()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ldefpackage/c13;

    .line 26
    .line 27
    iget-object v2, v2, Ldefpackage/c13;->n:Ldefpackage/f13;

    .line 28
    .line 29
    iget v2, v2, Ldefpackage/f13;->p:I

    .line 30
    .line 31
    if-ltz p1, :cond_0

    .line 32
    .line 33
    if-lt p1, v2, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v4, "Index ("

    .line 38
    .line 39
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v4, ") is out of bound of [0, "

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, ")"

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, Ldefpackage/cz1;->d(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v1}, Ldefpackage/c72;->H()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    const-string v2, "Pre-measure called on node that is not placed"

    .line 72
    .line 73
    invoke-static {v2}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object v0, v0, Ldefpackage/o72;->n:Ldefpackage/c72;

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    iput-boolean v2, v0, Ldefpackage/c72;->C:Z

    .line 80
    .line 81
    invoke-static {v1}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Ldefpackage/c13;

    .line 90
    .line 91
    invoke-virtual {v1, p1}, Ldefpackage/c13;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ldefpackage/c72;

    .line 96
    .line 97
    check-cast v2, Ldefpackage/ra;

    .line 98
    .line 99
    invoke-virtual {v2, v1, p2, p3}, Ldefpackage/ra;->r(Ldefpackage/c72;J)V

    .line 100
    .line 101
    .line 102
    const/4 p2, 0x0

    .line 103
    iput-boolean p2, v0, Ldefpackage/c72;->C:Z

    .line 104
    .line 105
    iget-object p0, p0, Ldefpackage/n72;->a:Ldefpackage/j03;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ldefpackage/j03;->a(I)Z

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
.end method
