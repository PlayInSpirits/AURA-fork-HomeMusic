.class public final Ldefpackage/vs4;
.super Ldefpackage/gx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldefpackage/gx2;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ldefpackage/zs4;

.field public final c:Ldefpackage/ha1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ldefpackage/zs4;Ldefpackage/ha1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/vs4;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/vs4;->b:Ldefpackage/zs4;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/vs4;->c:Ldefpackage/ha1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()Ldefpackage/cx2;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/ys4;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/cx2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/vs4;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v1, v0, Ldefpackage/ys4;->B:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/vs4;->b:Ldefpackage/zs4;

    .line 11
    .line 12
    iput-object v1, v0, Ldefpackage/ys4;->C:Ldefpackage/zs4;

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/vs4;->c:Ldefpackage/ha1;

    .line 15
    .line 16
    iput-object p0, v0, Ldefpackage/ys4;->D:Ldefpackage/ha1;

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    iput p0, v0, Ldefpackage/ys4;->E:I

    .line 20
    .line 21
    iput-boolean p0, v0, Ldefpackage/ys4;->F:Z

    .line 22
    .line 23
    const v1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    iput v1, v0, Ldefpackage/ys4;->G:I

    .line 27
    .line 28
    iput p0, v0, Ldefpackage/ys4;->H:I

    .line 29
    .line 30
    return-object v0
.end method

.method public final e(Ldefpackage/cx2;)V
    .locals 10

    .line 1
    check-cast p1, Ldefpackage/ys4;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Ldefpackage/ys4;->C:Ldefpackage/zs4;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    iget-object v3, p0, Ldefpackage/vs4;->b:Ldefpackage/zs4;

    .line 11
    .line 12
    if-eq v3, v0, :cond_1

    .line 13
    .line 14
    iget-object v4, v3, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 15
    .line 16
    iget-object v0, v0, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 17
    .line 18
    invoke-virtual {v4, v0}, Ldefpackage/ij4;->b(Ldefpackage/ij4;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    :goto_0
    move v0, v1

    .line 31
    :goto_1
    iget-object v4, p1, Ldefpackage/ys4;->B:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v5, p0, Ldefpackage/vs4;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v4, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    move v4, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iput-object v5, p1, Ldefpackage/ys4;->B:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    iput-object v4, p1, Ldefpackage/ys4;->L:Ldefpackage/xs4;

    .line 47
    .line 48
    move v4, v2

    .line 49
    :goto_2
    iget-object v5, p1, Ldefpackage/ys4;->C:Ldefpackage/zs4;

    .line 50
    .line 51
    if-eq v5, v3, :cond_3

    .line 52
    .line 53
    iget-object v6, v5, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 54
    .line 55
    iget-object v7, v3, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 56
    .line 57
    invoke-static {v6, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    iget-object v5, v5, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 64
    .line 65
    iget-object v6, v3, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Ldefpackage/ij4;->a(Ldefpackage/ij4;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    :goto_3
    move v1, v2

    .line 78
    :cond_4
    xor-int/2addr v1, v2

    .line 79
    iput-object v3, p1, Ldefpackage/ys4;->C:Ldefpackage/zs4;

    .line 80
    .line 81
    iget v3, p1, Ldefpackage/ys4;->H:I

    .line 82
    .line 83
    if-eq v3, v2, :cond_5

    .line 84
    .line 85
    iput v2, p1, Ldefpackage/ys4;->H:I

    .line 86
    .line 87
    move v1, v2

    .line 88
    :cond_5
    iget v3, p1, Ldefpackage/ys4;->G:I

    .line 89
    .line 90
    const v5, 0x7fffffff

    .line 91
    .line 92
    .line 93
    if-eq v3, v5, :cond_6

    .line 94
    .line 95
    iput v5, p1, Ldefpackage/ys4;->G:I

    .line 96
    .line 97
    move v1, v2

    .line 98
    :cond_6
    iget-boolean v3, p1, Ldefpackage/ys4;->F:Z

    .line 99
    .line 100
    if-eq v3, v2, :cond_7

    .line 101
    .line 102
    iput-boolean v2, p1, Ldefpackage/ys4;->F:Z

    .line 103
    .line 104
    move v1, v2

    .line 105
    :cond_7
    iget-object v3, p1, Ldefpackage/ys4;->D:Ldefpackage/ha1;

    .line 106
    .line 107
    iget-object p0, p0, Ldefpackage/vs4;->c:Ldefpackage/ha1;

    .line 108
    .line 109
    invoke-static {v3, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_8

    .line 114
    .line 115
    iput-object p0, p1, Ldefpackage/ys4;->D:Ldefpackage/ha1;

    .line 116
    .line 117
    move v1, v2

    .line 118
    :cond_8
    iget p0, p1, Ldefpackage/ys4;->E:I

    .line 119
    .line 120
    if-ne p0, v2, :cond_9

    .line 121
    .line 122
    move v2, v1

    .line 123
    goto :goto_4

    .line 124
    :cond_9
    iput v2, p1, Ldefpackage/ys4;->E:I

    .line 125
    .line 126
    :goto_4
    if-nez v4, :cond_a

    .line 127
    .line 128
    if-eqz v2, :cond_b

    .line 129
    .line 130
    :cond_a
    invoke-virtual {p1}, Ldefpackage/ys4;->q0()Ldefpackage/rd3;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    iget-object v1, p1, Ldefpackage/ys4;->B:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v3, p1, Ldefpackage/ys4;->C:Ldefpackage/zs4;

    .line 137
    .line 138
    iget-object v5, p1, Ldefpackage/ys4;->D:Ldefpackage/ha1;

    .line 139
    .line 140
    iget v6, p1, Ldefpackage/ys4;->E:I

    .line 141
    .line 142
    iget-boolean v7, p1, Ldefpackage/ys4;->F:Z

    .line 143
    .line 144
    iget v8, p1, Ldefpackage/ys4;->G:I

    .line 145
    .line 146
    iget v9, p1, Ldefpackage/ys4;->H:I

    .line 147
    .line 148
    iput-object v1, p0, Ldefpackage/rd3;->a:Ljava/lang/String;

    .line 149
    .line 150
    iput-object v3, p0, Ldefpackage/rd3;->b:Ldefpackage/zs4;

    .line 151
    .line 152
    iput-object v5, p0, Ldefpackage/rd3;->c:Ldefpackage/ha1;

    .line 153
    .line 154
    iput v6, p0, Ldefpackage/rd3;->d:I

    .line 155
    .line 156
    iput-boolean v7, p0, Ldefpackage/rd3;->e:Z

    .line 157
    .line 158
    iput v8, p0, Ldefpackage/rd3;->f:I

    .line 159
    .line 160
    iput v9, p0, Ldefpackage/rd3;->g:I

    .line 161
    .line 162
    iget-wide v5, p0, Ldefpackage/rd3;->q:J

    .line 163
    .line 164
    const/4 v1, 0x2

    .line 165
    shl-long/2addr v5, v1

    .line 166
    const-wide/16 v7, 0x2

    .line 167
    .line 168
    or-long/2addr v5, v7

    .line 169
    iput-wide v5, p0, Ldefpackage/rd3;->q:J

    .line 170
    .line 171
    invoke-virtual {p0}, Ldefpackage/rd3;->b()V

    .line 172
    .line 173
    .line 174
    :cond_b
    iget-boolean p0, p1, Ldefpackage/cx2;->A:Z

    .line 175
    .line 176
    if-nez p0, :cond_c

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_c
    if-nez v4, :cond_d

    .line 180
    .line 181
    if-eqz v0, :cond_e

    .line 182
    .line 183
    iget-object p0, p1, Ldefpackage/ys4;->K:Ldefpackage/ws4;

    .line 184
    .line 185
    if-eqz p0, :cond_e

    .line 186
    .line 187
    :cond_d
    invoke-static {p1}, Ldefpackage/fu;->C(Ldefpackage/g94;)V

    .line 188
    .line 189
    .line 190
    :cond_e
    if-nez v4, :cond_f

    .line 191
    .line 192
    if-eqz v2, :cond_10

    .line 193
    .line 194
    :cond_f
    invoke-static {p1}, Ldefpackage/g12;->A(Ldefpackage/u62;)V

    .line 195
    .line 196
    .line 197
    invoke-static {p1}, Ldefpackage/jz4;->z(Ldefpackage/rv0;)V

    .line 198
    .line 199
    .line 200
    :cond_10
    if-eqz v0, :cond_11

    .line 201
    .line 202
    invoke-static {p1}, Ldefpackage/jz4;->z(Ldefpackage/rv0;)V

    .line 203
    .line 204
    .line 205
    :cond_11
    :goto_5
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ldefpackage/vs4;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Ldefpackage/vs4;

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/vs4;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p1, Ldefpackage/vs4;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v1, p0, Ldefpackage/vs4;->b:Ldefpackage/zs4;

    .line 24
    .line 25
    iget-object v2, p1, Ldefpackage/vs4;->b:Ldefpackage/zs4;

    .line 26
    .line 27
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object p0, p0, Ldefpackage/vs4;->c:Ldefpackage/ha1;

    .line 35
    .line 36
    iget-object p1, p1, Ldefpackage/vs4;->c:Ldefpackage/ha1;

    .line 37
    .line 38
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_4

    .line 43
    .line 44
    :goto_0
    const/4 p0, 0x0

    .line 45
    return p0

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/vs4;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Ldefpackage/vs4;->b:Ldefpackage/zs4;

    .line 11
    .line 12
    invoke-virtual {v2}, Ldefpackage/zs4;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object p0, p0, Ldefpackage/vs4;->c:Ldefpackage/ha1;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v2

    .line 25
    mul-int/2addr p0, v1

    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-static {v0, p0, v1}, Ldefpackage/f34;->d(III)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, p0

    .line 36
    mul-int/2addr v2, v1

    .line 37
    const p0, 0x7fffffff

    .line 38
    .line 39
    .line 40
    add-int/2addr v2, p0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/2addr v2, v1

    .line 44
    return v2
.end method
