.class public final Lov1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lzn4;


# instance fields
.field public final n:Lbe3;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lbe3;

    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-direct {p1, v0}, Lbe3;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lov1;->n:Lbe3;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lbe3;

    .line 21
    .line 22
    invoke-direct {p1}, Lbe3;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lov1;->n:Lbe3;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ll51;Lkv1;I)Lqv2;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v0

    .line 4
    move-object v3, v1

    .line 5
    :goto_0
    move v4, v0

    .line 6
    :cond_0
    rem-int/lit8 v5, v4, 0xa

    .line 7
    .line 8
    add-int/lit8 v6, v5, 0xa

    .line 9
    .line 10
    iget-object v7, p0, Lov1;->n:Lbe3;

    .line 11
    .line 12
    const/16 v8, 0xa

    .line 13
    .line 14
    if-nez v5, :cond_1

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    iget-object v9, v7, Lbe3;->a:[B

    .line 19
    .line 20
    const/16 v10, 0x9

    .line 21
    .line 22
    invoke-static {v9, v8, v9, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-nez v4, :cond_2

    .line 26
    .line 27
    move v9, v8

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/4 v9, 0x1

    .line 30
    :goto_1
    :try_start_0
    iget-object v10, v7, Lbe3;->a:[B

    .line 31
    .line 32
    sub-int v11, v6, v9

    .line 33
    .line 34
    invoke-interface {p1, v10, v11, v9}, Ll51;->n([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7, v5}, Lbe3;->N(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7, v6}, Lbe3;->M(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Lbe3;->a()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v6, 0x3

    .line 48
    if-lt v5, v6, :cond_7

    .line 49
    .line 50
    invoke-virtual {v7}, Lbe3;->D()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    iget v9, v7, Lbe3;->b:I

    .line 55
    .line 56
    sub-int/2addr v9, v6

    .line 57
    iput v9, v7, Lbe3;->b:I

    .line 58
    .line 59
    const v6, 0x494433

    .line 60
    .line 61
    .line 62
    if-ne v5, v6, :cond_4

    .line 63
    .line 64
    const/4 v4, 0x6

    .line 65
    invoke-virtual {v7, v4}, Lbe3;->O(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7}, Lbe3;->z()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    add-int/lit8 v5, v4, 0xa

    .line 73
    .line 74
    if-nez v3, :cond_3

    .line 75
    .line 76
    new-array v3, v5, [B

    .line 77
    .line 78
    iget-object v6, v7, Lbe3;->a:[B

    .line 79
    .line 80
    invoke-static {v6, v9, v3, v0, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v3, v8, v4}, Ll51;->n([BII)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Lmv1;

    .line 87
    .line 88
    invoke-direct {v4, p2}, Lmv1;-><init>(Lkv1;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v5, v3}, Lmv1;->O(I[B)Lqv2;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    invoke-interface {p1, v4}, Ll51;->g(I)V

    .line 97
    .line 98
    .line 99
    :goto_2
    add-int/2addr v2, v5

    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-virtual {v7}, Lbe3;->i()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    invoke-static {v5}, Ljz4;->v(I)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    const/4 v6, -0x1

    .line 110
    if-eq v5, v6, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    if-nez v4, :cond_6

    .line 114
    .line 115
    const/16 v5, 0x14

    .line 116
    .line 117
    invoke-virtual {v7, v5}, Lbe3;->c(I)V

    .line 118
    .line 119
    .line 120
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    if-le v4, p3, :cond_0

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    iget p0, v7, Lbe3;->b:I

    .line 126
    .line 127
    iget p1, v7, Lbe3;->c:I

    .line 128
    .line 129
    invoke-static {p0, p1}, Ler1;->h(II)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :catch_0
    :goto_3
    invoke-interface {p1}, Ll51;->k()V

    .line 134
    .line 135
    .line 136
    invoke-interface {p1, v2}, Ll51;->g(I)V

    .line 137
    .line 138
    .line 139
    return-object v3
.end method

.method public c([BIILyn4;Lwc0;)V
    .locals 10

    .line 1
    add-int/2addr p3, p2

    .line 2
    iget-object p0, p0, Lov1;->n:Lbe3;

    .line 3
    .line 4
    invoke-virtual {p0, p3, p1}, Lbe3;->L(I[B)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lbe3;->N(I)V

    .line 8
    .line 9
    .line 10
    new-instance v5, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0}, Lbe3;->a()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-lez p1, :cond_8

    .line 20
    .line 21
    invoke-virtual {p0}, Lbe3;->a()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 p2, 0x0

    .line 26
    const/4 p3, 0x1

    .line 27
    const/16 p4, 0x8

    .line 28
    .line 29
    if-lt p1, p4, :cond_0

    .line 30
    .line 31
    move p1, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move p1, p2

    .line 34
    :goto_1
    const-string v0, "Incomplete Mp4Webvtt Top Level box header found."

    .line 35
    .line 36
    invoke-static {v0, p1}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lbe3;->m()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0}, Lbe3;->m()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const v1, 0x76747463

    .line 48
    .line 49
    .line 50
    if-ne v0, v1, :cond_7

    .line 51
    .line 52
    add-int/lit8 p1, p1, -0x8

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    move-object v1, v0

    .line 56
    move-object v2, v1

    .line 57
    :cond_1
    :goto_2
    if-lez p1, :cond_4

    .line 58
    .line 59
    if-lt p1, p4, :cond_2

    .line 60
    .line 61
    move v3, p3

    .line 62
    goto :goto_3

    .line 63
    :cond_2
    move v3, p2

    .line 64
    :goto_3
    const-string v4, "Incomplete vtt cue box header found."

    .line 65
    .line 66
    invoke-static {v4, v3}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lbe3;->m()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {p0}, Lbe3;->m()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    add-int/lit8 p1, p1, -0x8

    .line 78
    .line 79
    sub-int/2addr v3, p4

    .line 80
    iget-object v6, p0, Lbe3;->a:[B

    .line 81
    .line 82
    iget v7, p0, Lbe3;->b:I

    .line 83
    .line 84
    sget-object v8, Lf35;->a:Ljava/lang/String;

    .line 85
    .line 86
    new-instance v8, Ljava/lang/String;

    .line 87
    .line 88
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 89
    .line 90
    invoke-direct {v8, v6, v7, v3, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v3}, Lbe3;->O(I)V

    .line 94
    .line 95
    .line 96
    sub-int/2addr p1, v3

    .line 97
    const v3, 0x73747467

    .line 98
    .line 99
    .line 100
    if-ne v4, v3, :cond_3

    .line 101
    .line 102
    new-instance v2, Lv95;

    .line 103
    .line 104
    invoke-direct {v2}, Lv95;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-static {v8, v2}, Lw95;->e(Ljava/lang/String;Lv95;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Lv95;->a()Lhg0;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    const v3, 0x7061796c

    .line 116
    .line 117
    .line 118
    if-ne v4, v3, :cond_1

    .line 119
    .line 120
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 125
    .line 126
    invoke-static {v0, v1, v3}, Lw95;->f(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    goto :goto_2

    .line 131
    :cond_4
    if-nez v1, :cond_5

    .line 132
    .line 133
    const-string v1, ""

    .line 134
    .line 135
    :cond_5
    if-eqz v2, :cond_6

    .line 136
    .line 137
    iput-object v1, v2, Lhg0;->a:Ljava/lang/CharSequence;

    .line 138
    .line 139
    iput-object v0, v2, Lhg0;->b:Landroid/graphics/Bitmap;

    .line 140
    .line 141
    invoke-virtual {v2}, Lhg0;->a()Lig0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    goto :goto_4

    .line 146
    :cond_6
    sget-object p1, Lw95;->a:Ljava/util/regex/Pattern;

    .line 147
    .line 148
    new-instance p1, Lv95;

    .line 149
    .line 150
    invoke-direct {p1}, Lv95;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v1, p1, Lv95;->c:Ljava/lang/CharSequence;

    .line 154
    .line 155
    invoke-virtual {p1}, Lv95;->a()Lhg0;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p1}, Lhg0;->a()Lig0;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :goto_4
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_7
    add-int/lit8 p1, p1, -0x8

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Lbe3;->O(I)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_8
    new-instance v0, Llg0;

    .line 176
    .line 177
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    invoke-direct/range {v0 .. v5}, Llg0;-><init>(JJLjava/util/List;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p5, v0}, Lwc0;->accept(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    return-void
.end method
