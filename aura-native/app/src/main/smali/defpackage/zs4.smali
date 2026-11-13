.class public final Ldefpackage/zs4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/ij4;

.field public final b:Ldefpackage/sd3;

.field public final c:Ldefpackage/eh3;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/zs4;

    .line 2
    .line 3
    const-wide/16 v4, 0x0

    .line 4
    .line 5
    const v1, 0xffffff

    .line 6
    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Ldefpackage/zs4;-><init>(IJJ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 21

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-wide v0, Ldefpackage/x40;->g:J

    .line 6
    .line 7
    move-wide v3, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide/from16 v3, p2

    .line 10
    .line 11
    :goto_0
    and-int/lit8 v0, p1, 0x2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    sget-wide v0, Ldefpackage/bt4;->c:J

    .line 16
    .line 17
    move-wide v5, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-wide/from16 v5, p4

    .line 20
    .line 21
    :goto_1
    sget-wide v10, Ldefpackage/bt4;->c:J

    .line 22
    .line 23
    sget-wide v17, Ldefpackage/x40;->g:J

    .line 24
    .line 25
    const v0, 0x8000

    .line 26
    .line 27
    .line 28
    and-int v0, p1, v0

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    const/4 v0, 0x3

    .line 35
    :goto_2
    new-instance v2, Ldefpackage/ij4;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    move-wide v12, v10

    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v14, 0x0

    .line 44
    const/4 v15, 0x0

    .line 45
    const/16 v16, 0x0

    .line 46
    .line 47
    const/16 v19, 0x0

    .line 48
    .line 49
    const/16 v20, 0x0

    .line 50
    .line 51
    invoke-direct/range {v2 .. v20}, Ldefpackage/ij4;-><init>(JJLdefpackage/gb1;Ldefpackage/eb1;Ldefpackage/fb1;Ldefpackage/vk0;Ljava/lang/String;JLdefpackage/hr;Ldefpackage/bs4;Ldefpackage/vd2;JLdefpackage/sr4;Ldefpackage/xb4;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, Ldefpackage/sd3;

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    move-wide v10, v12

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const/16 v17, 0x0

    .line 64
    .line 65
    move v8, v0

    .line 66
    invoke-direct/range {v7 .. v17}, Ldefpackage/sd3;-><init>(IIJLdefpackage/cs4;Ldefpackage/zg3;Ldefpackage/ra2;IILdefpackage/qs4;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    move-object/from16 v1, p0

    .line 71
    .line 72
    invoke-direct {v1, v2, v7, v0}, Ldefpackage/zs4;-><init>(Ldefpackage/ij4;Ldefpackage/sd3;Ldefpackage/eh3;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(Ldefpackage/ij4;Ldefpackage/sd3;)V
    .locals 2

    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    iget-object v0, p2, Ldefpackage/sd3;->e:Ldefpackage/zg3;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 78
    :cond_0
    new-instance v1, Ldefpackage/eh3;

    invoke-direct {v1, v0}, Ldefpackage/eh3;-><init>(Ldefpackage/zg3;)V

    move-object v0, v1

    .line 79
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Ldefpackage/zs4;-><init>(Ldefpackage/ij4;Ldefpackage/sd3;Ldefpackage/eh3;)V

    return-void
.end method

.method public constructor <init>(Ldefpackage/ij4;Ldefpackage/sd3;Ldefpackage/eh3;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 82
    iput-object p2, p0, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 83
    iput-object p3, p0, Ldefpackage/zs4;->c:Ldefpackage/eh3;

    return-void
.end method

.method public static a(Ldefpackage/zs4;J)Ldefpackage/zs4;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-wide v4, Ldefpackage/bt4;->c:J

    .line 4
    .line 5
    sget-wide v18, Ldefpackage/x40;->g:J

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 8
    .line 9
    move-wide v6, v4

    .line 10
    const/4 v4, 0x0

    .line 11
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    const/4 v12, 0x0

    .line 18
    const/4 v15, 0x0

    .line 19
    const/16 v16, 0x0

    .line 20
    .line 21
    const/16 v17, 0x0

    .line 22
    .line 23
    const/16 v20, 0x0

    .line 24
    .line 25
    const/16 v21, 0x0

    .line 26
    .line 27
    const/16 v22, 0x0

    .line 28
    .line 29
    move-wide v13, v6

    .line 30
    move-wide/from16 v2, p1

    .line 31
    .line 32
    invoke-static/range {v1 .. v22}, Ldefpackage/jj4;->a(Ldefpackage/ij4;JLdefpackage/uo;FJLdefpackage/gb1;Ldefpackage/eb1;Ldefpackage/fb1;Ldefpackage/vk0;Ljava/lang/String;JLdefpackage/hr;Ldefpackage/bs4;Ldefpackage/vd2;JLdefpackage/sr4;Ldefpackage/xb4;Ldefpackage/q05;)Ldefpackage/ij4;

    .line 33
    .line 34
    .line 35
    move-result-object v12

    .line 36
    iget-object v1, v0, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    move-wide v4, v6

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    invoke-static/range {v1 .. v11}, Ldefpackage/td3;->a(Ldefpackage/sd3;IIJLdefpackage/cs4;Ldefpackage/zg3;Ldefpackage/ra2;IILdefpackage/qs4;)Ldefpackage/sd3;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, v0, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 50
    .line 51
    if-ne v2, v12, :cond_0

    .line 52
    .line 53
    iget-object v2, v0, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 54
    .line 55
    if-ne v2, v1, :cond_0

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_0
    new-instance v0, Ldefpackage/zs4;

    .line 59
    .line 60
    invoke-direct {v0, v12, v1}, Ldefpackage/zs4;-><init>(Ldefpackage/ij4;Ldefpackage/sd3;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ldefpackage/zs4;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Ldefpackage/zs4;

    .line 12
    .line 13
    iget-object v1, p1, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 14
    .line 15
    iget-object v3, p0, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 16
    .line 17
    invoke-static {v3, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 25
    .line 26
    iget-object v3, p1, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 27
    .line 28
    invoke-static {v1, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, Ldefpackage/zs4;->c:Ldefpackage/eh3;

    .line 36
    .line 37
    iget-object p1, p1, Ldefpackage/zs4;->c:Ldefpackage/eh3;

    .line 38
    .line 39
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ij4;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 10
    .line 11
    invoke-virtual {v1}, Ldefpackage/sd3;->hashCode()I

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
    iget-object p0, p0, Ldefpackage/zs4;->c:Ldefpackage/eh3;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/eh3;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    add-int/2addr v1, p0

    .line 29
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/ij4;->a:Ldefpackage/as4;

    .line 6
    .line 7
    invoke-interface {v2}, Ldefpackage/as4;->c()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-static {v2, v3}, Ldefpackage/x40;->h(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, v1, Ldefpackage/ij4;->a:Ldefpackage/as4;

    .line 16
    .line 17
    invoke-interface {v3}, Ldefpackage/as4;->f()Ldefpackage/uo;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, v1, Ldefpackage/ij4;->a:Ldefpackage/as4;

    .line 22
    .line 23
    invoke-interface {v4}, Ldefpackage/as4;->b()F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-wide v5, v1, Ldefpackage/ij4;->b:J

    .line 28
    .line 29
    invoke-static {v5, v6}, Ldefpackage/bt4;->d(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, v1, Ldefpackage/ij4;->c:Ldefpackage/gb1;

    .line 34
    .line 35
    iget-object v7, v1, Ldefpackage/ij4;->d:Ldefpackage/eb1;

    .line 36
    .line 37
    iget-object v8, v1, Ldefpackage/ij4;->e:Ldefpackage/fb1;

    .line 38
    .line 39
    iget-object v9, v1, Ldefpackage/ij4;->f:Ldefpackage/vk0;

    .line 40
    .line 41
    iget-object v10, v1, Ldefpackage/ij4;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-wide v11, v1, Ldefpackage/ij4;->h:J

    .line 44
    .line 45
    invoke-static {v11, v12}, Ldefpackage/bt4;->d(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    iget-object v12, v1, Ldefpackage/ij4;->i:Ldefpackage/hr;

    .line 50
    .line 51
    iget-object v13, v1, Ldefpackage/ij4;->j:Ldefpackage/bs4;

    .line 52
    .line 53
    iget-object v14, v1, Ldefpackage/ij4;->k:Ldefpackage/vd2;

    .line 54
    .line 55
    move-object/from16 v16, v14

    .line 56
    .line 57
    iget-wide v14, v1, Ldefpackage/ij4;->l:J

    .line 58
    .line 59
    invoke-static {v14, v15}, Ldefpackage/x40;->h(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    iget-object v15, v1, Ldefpackage/ij4;->m:Ldefpackage/sr4;

    .line 64
    .line 65
    move-object/from16 v17, v15

    .line 66
    .line 67
    iget-object v15, v1, Ldefpackage/ij4;->n:Ldefpackage/xb4;

    .line 68
    .line 69
    iget-object v1, v1, Ldefpackage/ij4;->o:Ldefpackage/q05;

    .line 70
    .line 71
    move-object/from16 v18, v1

    .line 72
    .line 73
    iget-object v1, v0, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 74
    .line 75
    iget v0, v1, Ldefpackage/sd3;->a:I

    .line 76
    .line 77
    invoke-static {v0}, Ldefpackage/mr4;->a(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    move-object/from16 v19, v0

    .line 82
    .line 83
    iget v0, v1, Ldefpackage/sd3;->b:I

    .line 84
    .line 85
    invoke-static {v0}, Ldefpackage/ur4;->a(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object/from16 v20, v14

    .line 90
    .line 91
    move-object/from16 v21, v15

    .line 92
    .line 93
    iget-wide v14, v1, Ldefpackage/sd3;->c:J

    .line 94
    .line 95
    invoke-static {v14, v15}, Ldefpackage/bt4;->d(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    iget-object v15, v1, Ldefpackage/sd3;->d:Ldefpackage/cs4;

    .line 100
    .line 101
    move-object/from16 v22, v15

    .line 102
    .line 103
    iget-object v15, v1, Ldefpackage/sd3;->f:Ldefpackage/ra2;

    .line 104
    .line 105
    move-object/from16 v23, v15

    .line 106
    .line 107
    iget v15, v1, Ldefpackage/sd3;->g:I

    .line 108
    .line 109
    invoke-static {v15}, Ldefpackage/ma2;->a(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    move-object/from16 v24, v15

    .line 114
    .line 115
    iget v15, v1, Ldefpackage/sd3;->h:I

    .line 116
    .line 117
    invoke-static {v15}, Ldefpackage/du1;->a(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    iget-object v1, v1, Ldefpackage/sd3;->i:Ldefpackage/qs4;

    .line 122
    .line 123
    move-object/from16 v25, v1

    .line 124
    .line 125
    new-instance v1, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    move-object/from16 v26, v15

    .line 128
    .line 129
    const-string v15, "TextStyle(color="

    .line 130
    .line 131
    invoke-direct {v1, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v2, ", brush="

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v2, ", alpha="

    .line 146
    .line 147
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v2, ", fontSize="

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v2, ", fontWeight="

    .line 162
    .line 163
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v2, ", fontStyle="

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v2, ", fontSynthesis="

    .line 178
    .line 179
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, ", fontFamily="

    .line 186
    .line 187
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v2, ", fontFeatureSettings="

    .line 194
    .line 195
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v2, ", letterSpacing="

    .line 199
    .line 200
    const-string v3, ", baselineShift="

    .line 201
    .line 202
    invoke-static {v1, v10, v2, v11, v3}, Ldefpackage/f34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v2, ", textGeometricTransform="

    .line 209
    .line 210
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v2, ", localeList="

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    move-object/from16 v2, v16

    .line 222
    .line 223
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v2, ", background="

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    move-object/from16 v2, v20

    .line 232
    .line 233
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v2, ", textDecoration="

    .line 237
    .line 238
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    move-object/from16 v2, v17

    .line 242
    .line 243
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v2, ", shadow="

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    move-object/from16 v2, v21

    .line 252
    .line 253
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string v2, ", drawStyle="

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    move-object/from16 v2, v18

    .line 262
    .line 263
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v2, ", textAlign="

    .line 267
    .line 268
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    move-object/from16 v2, v19

    .line 272
    .line 273
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v2, ", textDirection="

    .line 277
    .line 278
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v2, ", lineHeight="

    .line 282
    .line 283
    const-string v3, ", textIndent="

    .line 284
    .line 285
    invoke-static {v1, v0, v2, v14, v3}, Ldefpackage/f34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    move-object/from16 v0, v22

    .line 289
    .line 290
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const-string v0, ", platformStyle="

    .line 294
    .line 295
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    move-object/from16 v0, p0

    .line 299
    .line 300
    iget-object v0, v0, Ldefpackage/zs4;->c:Ldefpackage/eh3;

    .line 301
    .line 302
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string v0, ", lineHeightStyle="

    .line 306
    .line 307
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    move-object/from16 v0, v23

    .line 311
    .line 312
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const-string v0, ", lineBreak="

    .line 316
    .line 317
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    move-object/from16 v0, v24

    .line 321
    .line 322
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    const-string v0, ", hyphens="

    .line 326
    .line 327
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    move-object/from16 v0, v26

    .line 331
    .line 332
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string v0, ", textMotion="

    .line 336
    .line 337
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    move-object/from16 v0, v25

    .line 341
    .line 342
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    const-string v0, ")"

    .line 346
    .line 347
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    return-object v0
.end method
