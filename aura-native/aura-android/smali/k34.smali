.class public final Lk34;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lac4;


# instance fields
.field public final a:Llu0;

.field public final b:Llu0;

.field public final c:Llu0;

.field public final d:Llu0;


# direct methods
.method public constructor <init>(Llu0;Llu0;Llu0;Llu0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk34;->a:Llu0;

    .line 5
    .line 6
    iput-object p2, p0, Lk34;->b:Llu0;

    .line 7
    .line 8
    iput-object p3, p0, Lk34;->c:Llu0;

    .line 9
    .line 10
    iput-object p4, p0, Lk34;->d:Llu0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(JLr62;Loo0;)Lya4;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v0, Lk34;->a:Llu0;

    .line 10
    .line 11
    invoke-virtual {v5, v1, v2, v4}, Llu0;->a(JLoo0;)F

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v6, v0, Lk34;->b:Llu0;

    .line 16
    .line 17
    invoke-virtual {v6, v1, v2, v4}, Llu0;->a(JLoo0;)F

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    iget-object v7, v0, Lk34;->c:Llu0;

    .line 22
    .line 23
    invoke-virtual {v7, v1, v2, v4}, Llu0;->a(JLoo0;)F

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    iget-object v0, v0, Lk34;->d:Llu0;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v4}, Llu0;->a(JLoo0;)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    shr-long v8, v1, v4

    .line 36
    .line 37
    const-wide/32 v10, 0x7fffffff

    .line 38
    .line 39
    .line 40
    and-long/2addr v8, v10

    .line 41
    long-to-int v8, v8

    .line 42
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    and-long v9, v1, v10

    .line 47
    .line 48
    long-to-int v9, v9

    .line 49
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    add-float v9, v5, v0

    .line 58
    .line 59
    cmpl-float v10, v9, v8

    .line 60
    .line 61
    if-lez v10, :cond_0

    .line 62
    .line 63
    div-float v9, v8, v9

    .line 64
    .line 65
    mul-float/2addr v5, v9

    .line 66
    mul-float/2addr v0, v9

    .line 67
    :cond_0
    add-float v9, v6, v7

    .line 68
    .line 69
    cmpl-float v10, v9, v8

    .line 70
    .line 71
    if-lez v10, :cond_1

    .line 72
    .line 73
    div-float/2addr v8, v9

    .line 74
    mul-float/2addr v6, v8

    .line 75
    mul-float/2addr v7, v8

    .line 76
    :cond_1
    const/4 v8, 0x0

    .line 77
    cmpl-float v9, v5, v8

    .line 78
    .line 79
    if-ltz v9, :cond_2

    .line 80
    .line 81
    cmpl-float v9, v6, v8

    .line 82
    .line 83
    if-ltz v9, :cond_2

    .line 84
    .line 85
    cmpl-float v9, v7, v8

    .line 86
    .line 87
    if-ltz v9, :cond_2

    .line 88
    .line 89
    cmpl-float v9, v0, v8

    .line 90
    .line 91
    if-ltz v9, :cond_2

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    const-string v9, ", topEnd = "

    .line 95
    .line 96
    const-string v10, ", bottomEnd = "

    .line 97
    .line 98
    const-string v11, "Corner size in Px can\'t be negative(topStart = "

    .line 99
    .line 100
    invoke-static {v11, v5, v9, v6, v10}, Lb11;->r(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v10, ", bottomStart = "

    .line 108
    .line 109
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v10, ")!"

    .line 116
    .line 117
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-static {v9}, Lfz1;->a(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :goto_0
    add-float v9, v5, v6

    .line 128
    .line 129
    add-float/2addr v9, v7

    .line 130
    add-float/2addr v9, v0

    .line 131
    cmpg-float v8, v9, v8

    .line 132
    .line 133
    const-wide/16 v9, 0x0

    .line 134
    .line 135
    if-nez v8, :cond_3

    .line 136
    .line 137
    new-instance v0, Lnb3;

    .line 138
    .line 139
    invoke-static {v9, v10, v1, v2}, Lbu;->d(JJ)Lwv3;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-direct {v0, v1}, Lnb3;-><init>(Lwv3;)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_3
    new-instance v8, Lob3;

    .line 148
    .line 149
    invoke-static {v9, v10, v1, v2}, Lbu;->d(JJ)Lwv3;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    sget-object v2, Lr62;->n:Lr62;

    .line 154
    .line 155
    if-ne v3, v2, :cond_4

    .line 156
    .line 157
    move v9, v5

    .line 158
    goto :goto_1

    .line 159
    :cond_4
    move v9, v6

    .line 160
    :goto_1
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    int-to-long v10, v10

    .line 165
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    int-to-long v12, v9

    .line 170
    shl-long v9, v10, v4

    .line 171
    .line 172
    const-wide v14, 0xffffffffL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    and-long v11, v12, v14

    .line 178
    .line 179
    or-long v21, v9, v11

    .line 180
    .line 181
    if-ne v3, v2, :cond_5

    .line 182
    .line 183
    move v5, v6

    .line 184
    :cond_5
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    int-to-long v9, v6

    .line 189
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    int-to-long v5, v5

    .line 194
    shl-long/2addr v9, v4

    .line 195
    and-long/2addr v5, v14

    .line 196
    or-long v23, v9, v5

    .line 197
    .line 198
    if-ne v3, v2, :cond_6

    .line 199
    .line 200
    move v5, v7

    .line 201
    goto :goto_2

    .line 202
    :cond_6
    move v5, v0

    .line 203
    :goto_2
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    int-to-long v9, v6

    .line 208
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    int-to-long v5, v5

    .line 213
    shl-long/2addr v9, v4

    .line 214
    and-long/2addr v5, v14

    .line 215
    or-long v25, v9, v5

    .line 216
    .line 217
    if-ne v3, v2, :cond_7

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_7
    move v0, v7

    .line 221
    :goto_3
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    int-to-long v2, v2

    .line 226
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    int-to-long v5, v0

    .line 231
    shl-long/2addr v2, v4

    .line 232
    and-long v4, v5, v14

    .line 233
    .line 234
    or-long v27, v2, v4

    .line 235
    .line 236
    new-instance v16, Lg34;

    .line 237
    .line 238
    iget v0, v1, Lwv3;->a:F

    .line 239
    .line 240
    iget v2, v1, Lwv3;->b:F

    .line 241
    .line 242
    iget v3, v1, Lwv3;->c:F

    .line 243
    .line 244
    iget v1, v1, Lwv3;->d:F

    .line 245
    .line 246
    move/from16 v17, v0

    .line 247
    .line 248
    move/from16 v20, v1

    .line 249
    .line 250
    move/from16 v18, v2

    .line 251
    .line 252
    move/from16 v19, v3

    .line 253
    .line 254
    invoke-direct/range {v16 .. v28}, Lg34;-><init>(FFFFJJJJ)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v0, v16

    .line 258
    .line 259
    invoke-direct {v8, v0}, Lob3;-><init>(Lg34;)V

    .line 260
    .line 261
    .line 262
    return-object v8
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lk34;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lk34;

    .line 10
    .line 11
    iget-object v0, p1, Lk34;->a:Llu0;

    .line 12
    .line 13
    iget-object v1, p0, Lk34;->a:Llu0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lk34;->b:Llu0;

    .line 23
    .line 24
    iget-object v1, p1, Lk34;->b:Llu0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Lk34;->c:Llu0;

    .line 34
    .line 35
    iget-object v1, p1, Lk34;->c:Llu0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object p0, p0, Lk34;->d:Llu0;

    .line 45
    .line 46
    iget-object p1, p1, Lk34;->d:Llu0;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    :goto_0
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 57
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lk34;->a:Llu0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lk34;->b:Llu0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lk34;->c:Llu0;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object p0, p0, Lk34;->d:Llu0;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/2addr p0, v0

    .line 34
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RoundedCornerShape(topStart = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lk34;->a:Llu0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", topEnd = "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lk34;->b:Llu0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", bottomEnd = "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lk34;->c:Llu0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", bottomStart = "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lk34;->d:Llu0;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
