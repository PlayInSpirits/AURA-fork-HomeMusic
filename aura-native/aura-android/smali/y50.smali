.class public final Ly50;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lui2;


# instance fields
.field public final a:Lfs;


# direct methods
.method public constructor <init>(Lfs;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly50;->a:Lfs;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lcf2;Ljava/util/List;J)Lvi2;
    .locals 18

    .line 1
    move-object/from16 v4, p1

    .line 2
    .line 3
    invoke-static/range {p3 .. p4}, Lnc0;->i(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static/range {p3 .. p4}, Lnc0;->j(J)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static/range {p3 .. p4}, Lnc0;->g(J)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static/range {p3 .. p4}, Lnc0;->h(J)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-interface {v4, v5}, Loo0;->V(F)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    new-array v6, v6, [Ljg3;

    .line 29
    .line 30
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    new-array v8, v7, [I

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    const/4 v13, 0x0

    .line 40
    :goto_0
    if-ge v10, v7, :cond_4

    .line 41
    .line 42
    move-object/from16 v14, p2

    .line 43
    .line 44
    invoke-interface {v14, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v12

    .line 48
    check-cast v12, Lpi2;

    .line 49
    .line 50
    invoke-interface {v12}, Lpi2;->t()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sub-int v15, v2, v11

    .line 54
    .line 55
    aget-object v16, v6, v10

    .line 56
    .line 57
    if-nez v16, :cond_2

    .line 58
    .line 59
    const v9, 0x7fffffff

    .line 60
    .line 61
    .line 62
    if-ne v2, v9, :cond_0

    .line 63
    .line 64
    move/from16 v17, v2

    .line 65
    .line 66
    move-object/from16 p4, v8

    .line 67
    .line 68
    :goto_1
    const/4 v2, 0x0

    .line 69
    goto :goto_2

    .line 70
    :cond_0
    move/from16 v17, v2

    .line 71
    .line 72
    move-object/from16 p4, v8

    .line 73
    .line 74
    if-gez v15, :cond_1

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    const/4 v9, 0x0

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    move v9, v15

    .line 80
    goto :goto_1

    .line 81
    :goto_2
    invoke-static {v2, v3, v2, v9}, Lqc0;->a(IIII)J

    .line 82
    .line 83
    .line 84
    move-result-wide v8

    .line 85
    invoke-interface {v12, v8, v9}, Lpi2;->r(J)Ljg3;

    .line 86
    .line 87
    .line 88
    move-result-object v16

    .line 89
    :goto_3
    move-object/from16 v2, v16

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_2
    move/from16 v17, v2

    .line 93
    .line 94
    move-object/from16 p4, v8

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :goto_4
    iget v8, v2, Ljg3;->o:I

    .line 98
    .line 99
    iget v9, v2, Ljg3;->n:I

    .line 100
    .line 101
    aput v8, p4, v10

    .line 102
    .line 103
    sub-int v12, v15, v8

    .line 104
    .line 105
    if-gez v12, :cond_3

    .line 106
    .line 107
    const/4 v12, 0x0

    .line 108
    :cond_3
    invoke-static {v5, v12}, Ljava/lang/Math;->min(II)I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    add-int/2addr v8, v12

    .line 113
    add-int/2addr v11, v8

    .line 114
    invoke-static {v13, v9}, Ljava/lang/Math;->max(II)I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    aput-object v2, v6, v10

    .line 119
    .line 120
    add-int/lit8 v10, v10, 0x1

    .line 121
    .line 122
    move-object/from16 v8, p4

    .line 123
    .line 124
    move/from16 v2, v17

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    move-object/from16 p4, v8

    .line 128
    .line 129
    sub-int v2, v11, v12

    .line 130
    .line 131
    if-gez v2, :cond_5

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    :cond_5
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    const/4 v2, 0x0

    .line 139
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    new-array v5, v7, [I

    .line 148
    .line 149
    move v0, v2

    .line 150
    move v9, v0

    .line 151
    :goto_5
    if-ge v9, v7, :cond_6

    .line 152
    .line 153
    aget v1, p4, v9

    .line 154
    .line 155
    add-int/lit8 v10, v2, 0x1

    .line 156
    .line 157
    aput v0, v5, v2

    .line 158
    .line 159
    add-int/2addr v0, v1

    .line 160
    add-int/lit8 v9, v9, 0x1

    .line 161
    .line 162
    move v2, v10

    .line 163
    goto :goto_5

    .line 164
    :cond_6
    new-instance v0, Lx50;

    .line 165
    .line 166
    move-object/from16 v2, p0

    .line 167
    .line 168
    move-object v1, v6

    .line 169
    invoke-direct/range {v0 .. v5}, Lx50;-><init>([Ljg3;Ly50;ILcf2;[I)V

    .line 170
    .line 171
    .line 172
    sget-object v1, Lv01;->n:Lv01;

    .line 173
    .line 174
    invoke-interface {v4, v3, v8, v1, v0}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Ly50;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Ly50;

    .line 10
    .line 11
    iget-object p0, p0, Ly50;->a:Lfs;

    .line 12
    .line 13
    iget-object p1, p1, Ly50;->a:Lfs;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lfs;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    sget-object v0, Lgi;->a:Lpa;

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
    iget-object p0, p0, Ly50;->a:Lfs;

    .line 10
    .line 11
    iget p0, p0, Lfs;->a:F

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ColumnMeasurePolicy(verticalArrangement="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lgi;->a:Lpa;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", horizontalAlignment="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ly50;->a:Lfs;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
