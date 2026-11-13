.class public final Ldefpackage/qy2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/m84;


# instance fields
.field public final a:J

.field public final b:[Ldefpackage/ry2;

.field public final c:I


# direct methods
.method public constructor <init>(J[Ldefpackage/ry2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ldefpackage/qy2;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Ldefpackage/qy2;->b:[Ldefpackage/ry2;

    .line 7
    .line 8
    iput p4, p0, Ldefpackage/qy2;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final e(J)Ldefpackage/l84;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Ldefpackage/qy2;->b:[Ldefpackage/ry2;

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    sget-object v5, Ldefpackage/o84;->c:Ldefpackage/o84;

    .line 9
    .line 10
    if-nez v4, :cond_0

    .line 11
    .line 12
    new-instance v0, Ldefpackage/l84;

    .line 13
    .line 14
    invoke-direct {v0, v5, v5}, Ldefpackage/l84;-><init>(Ldefpackage/o84;Ldefpackage/o84;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    iget v0, v0, Ldefpackage/qy2;->c:I

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    const-wide/16 v8, -0x1

    .line 22
    .line 23
    if-eq v0, v4, :cond_3

    .line 24
    .line 25
    aget-object v10, v3, v0

    .line 26
    .line 27
    iget-object v10, v10, Ldefpackage/ry2;->b:Ldefpackage/xv4;

    .line 28
    .line 29
    invoke-virtual {v10, v1, v2}, Ldefpackage/xv4;->a(J)I

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    if-ne v11, v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {v10, v1, v2}, Ldefpackage/xv4;->b(J)I

    .line 36
    .line 37
    .line 38
    move-result v11

    .line 39
    :cond_1
    iget-object v12, v10, Ldefpackage/xv4;->c:[J

    .line 40
    .line 41
    iget-object v13, v10, Ldefpackage/xv4;->f:[J

    .line 42
    .line 43
    if-ne v11, v4, :cond_2

    .line 44
    .line 45
    new-instance v0, Ldefpackage/l84;

    .line 46
    .line 47
    invoke-direct {v0, v5, v5}, Ldefpackage/l84;-><init>(Ldefpackage/o84;Ldefpackage/o84;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    aget-wide v14, v13, v11

    .line 52
    .line 53
    aget-wide v16, v12, v11

    .line 54
    .line 55
    cmp-long v5, v14, v1

    .line 56
    .line 57
    if-gez v5, :cond_4

    .line 58
    .line 59
    iget v5, v10, Ldefpackage/xv4;->b:I

    .line 60
    .line 61
    add-int/lit8 v5, v5, -0x1

    .line 62
    .line 63
    if-ge v11, v5, :cond_4

    .line 64
    .line 65
    invoke-virtual {v10, v1, v2}, Ldefpackage/xv4;->b(J)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eq v1, v4, :cond_4

    .line 70
    .line 71
    if-eq v1, v11, :cond_4

    .line 72
    .line 73
    aget-wide v8, v13, v1

    .line 74
    .line 75
    aget-wide v1, v12, v1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const-wide v16, 0x7fffffffffffffffL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    move-wide v14, v1

    .line 84
    :cond_4
    move-wide v1, v8

    .line 85
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    :goto_0
    const/4 v5, 0x0

    .line 91
    move-wide/from16 v10, v16

    .line 92
    .line 93
    :goto_1
    array-length v12, v3

    .line 94
    if-ge v5, v12, :cond_b

    .line 95
    .line 96
    if-eq v5, v0, :cond_9

    .line 97
    .line 98
    aget-object v12, v3, v5

    .line 99
    .line 100
    iget-object v12, v12, Ldefpackage/ry2;->b:Ldefpackage/xv4;

    .line 101
    .line 102
    iget-object v13, v12, Ldefpackage/xv4;->c:[J

    .line 103
    .line 104
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v14, v15}, Ldefpackage/xv4;->a(J)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-ne v6, v4, :cond_5

    .line 114
    .line 115
    invoke-virtual {v12, v14, v15}, Ldefpackage/xv4;->b(J)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    :cond_5
    if-ne v6, v4, :cond_6

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    aget-wide v6, v13, v6

    .line 123
    .line 124
    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 125
    .line 126
    .line 127
    move-result-wide v10

    .line 128
    :goto_2
    cmp-long v6, v8, v16

    .line 129
    .line 130
    if-eqz v6, :cond_a

    .line 131
    .line 132
    invoke-virtual {v12, v8, v9}, Ldefpackage/xv4;->a(J)I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-ne v6, v4, :cond_7

    .line 137
    .line 138
    invoke-virtual {v12, v8, v9}, Ldefpackage/xv4;->b(J)I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    :cond_7
    if-ne v6, v4, :cond_8

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_8
    aget-wide v6, v13, v6

    .line 146
    .line 147
    invoke-static {v6, v7, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide v1

    .line 151
    goto :goto_3

    .line 152
    :cond_9
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :cond_a
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_b
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    new-instance v0, Ldefpackage/o84;

    .line 166
    .line 167
    invoke-direct {v0, v14, v15, v10, v11}, Ldefpackage/o84;-><init>(JJ)V

    .line 168
    .line 169
    .line 170
    cmp-long v3, v8, v16

    .line 171
    .line 172
    if-nez v3, :cond_c

    .line 173
    .line 174
    new-instance v1, Ldefpackage/l84;

    .line 175
    .line 176
    invoke-direct {v1, v0, v0}, Ldefpackage/l84;-><init>(Ldefpackage/o84;Ldefpackage/o84;)V

    .line 177
    .line 178
    .line 179
    return-object v1

    .line 180
    :cond_c
    new-instance v3, Ldefpackage/o84;

    .line 181
    .line 182
    invoke-direct {v3, v8, v9, v1, v2}, Ldefpackage/o84;-><init>(JJ)V

    .line 183
    .line 184
    .line 185
    new-instance v1, Ldefpackage/l84;

    .line 186
    .line 187
    invoke-direct {v1, v0, v3}, Ldefpackage/l84;-><init>(Ldefpackage/o84;Ldefpackage/o84;)V

    .line 188
    .line 189
    .line 190
    return-object v1
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/qy2;->a:J

    .line 2
    .line 3
    return-wide v0
.end method
