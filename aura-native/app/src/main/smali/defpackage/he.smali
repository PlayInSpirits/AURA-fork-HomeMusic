.class public final Ldefpackage/he;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final n:Ljava/util/List;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/util/ArrayList;

.field public final q:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/s54;->a:Ldefpackage/xc5;

    .line 2
    .line 3
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 189
    sget-object v0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 190
    invoke-direct {p0, p1, v0}, Ldefpackage/he;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .line 191
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p2, p1}, Ldefpackage/he;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/he;->n:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    if-eqz p1, :cond_4

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    move-object v2, p2

    .line 17
    move-object v3, v2

    .line 18
    :goto_0
    if-ge v1, v0, :cond_5

    .line 19
    .line 20
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Ldefpackage/ge;

    .line 25
    .line 26
    iget-object v5, v4, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 27
    .line 28
    instance-of v6, v5, Ldefpackage/ij4;

    .line 29
    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    instance-of v5, v5, Ldefpackage/sd3;

    .line 44
    .line 45
    if-eqz v5, :cond_3

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    move-object v2, p2

    .line 61
    move-object v3, v2

    .line 62
    :cond_5
    iput-object v2, p0, Ldefpackage/he;->p:Ljava/util/ArrayList;

    .line 63
    .line 64
    iput-object v3, p0, Ldefpackage/he;->q:Ljava/util/ArrayList;

    .line 65
    .line 66
    if-eqz v3, :cond_6

    .line 67
    .line 68
    new-instance p0, Ldefpackage/ca1;

    .line 69
    .line 70
    const/16 p1, 0xa

    .line 71
    .line 72
    invoke-direct {p0, p1}, Ldefpackage/ca1;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v3, p0}, Ldefpackage/q40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    goto :goto_2

    .line 80
    :cond_6
    move-object p0, p2

    .line 81
    :goto_2
    if-eqz p0, :cond_c

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_7

    .line 88
    .line 89
    goto :goto_6

    .line 90
    :cond_7
    invoke-static {p0}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Ldefpackage/ge;

    .line 95
    .line 96
    iget p1, p1, Ldefpackage/ge;->c:I

    .line 97
    .line 98
    sget-object v0, Ldefpackage/c02;->a:Ldefpackage/h03;

    .line 99
    .line 100
    new-instance v0, Ldefpackage/h03;

    .line 101
    .line 102
    const/4 v1, 0x1

    .line 103
    invoke-direct {v0, v1}, Ldefpackage/h03;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ldefpackage/h03;->a(I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    :goto_3
    if-ge v1, p1, :cond_c

    .line 114
    .line 115
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Ldefpackage/ge;

    .line 120
    .line 121
    :goto_4
    iget v3, v0, Ldefpackage/h03;->b:I

    .line 122
    .line 123
    if-eqz v3, :cond_b

    .line 124
    .line 125
    if-eqz v3, :cond_a

    .line 126
    .line 127
    iget-object v4, v0, Ldefpackage/h03;->a:[I

    .line 128
    .line 129
    add-int/lit8 v5, v3, -0x1

    .line 130
    .line 131
    aget v4, v4, v5

    .line 132
    .line 133
    iget v5, v2, Ldefpackage/ge;->b:I

    .line 134
    .line 135
    if-lt v5, v4, :cond_8

    .line 136
    .line 137
    add-int/lit8 v3, v3, -0x1

    .line 138
    .line 139
    invoke-virtual {v0, v3}, Ldefpackage/h03;->c(I)V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_8
    iget v3, v2, Ldefpackage/ge;->c:I

    .line 144
    .line 145
    if-gt v3, v4, :cond_9

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v6, "Paragraph overlap not allowed, end "

    .line 151
    .line 152
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v3, " should be less than or equal to "

    .line 159
    .line 160
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-static {v3}, Ldefpackage/dz1;->a(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_a
    const-string p0, "IntList is empty."

    .line 175
    .line 176
    invoke-static {p0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p2

    .line 180
    :cond_b
    :goto_5
    iget v2, v2, Ldefpackage/ge;->c:I

    .line 181
    .line 182
    invoke-virtual {v0, v2}, Ldefpackage/h03;->a(I)V

    .line 183
    .line 184
    .line 185
    add-int/lit8 v1, v1, 0x1

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_c
    :goto_6
    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

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
    instance-of v1, p1, Ldefpackage/he;

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
    check-cast p1, Ldefpackage/he;

    .line 12
    .line 13
    iget-object v1, p1, Ldefpackage/he;->o:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Ldefpackage/he;->o:Ljava/lang/String;

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
    iget-object p0, p0, Ldefpackage/he;->n:Ljava/util/List;

    .line 25
    .line 26
    iget-object p1, p1, Ldefpackage/he;->n:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/he;->n:Ljava/util/List;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, p0

    .line 20
    return v0
.end method

.method public final length()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 9

    .line 1
    const-string v0, ")"

    .line 2
    .line 3
    const-string v1, "start ("

    .line 4
    .line 5
    if-gt p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v3, ") should be less or equal to end ("

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2}, Ldefpackage/dz1;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v2, p0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ne p2, v3, :cond_1

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    invoke-virtual {v2, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    sget v3, Ldefpackage/ie;->a:I

    .line 50
    .line 51
    if-gt p1, p2, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ") should be less than or equal to end ("

    .line 63
    .line 64
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Ldefpackage/dz1;->a(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    iget-object p0, p0, Ldefpackage/he;->n:Ljava/util/List;

    .line 81
    .line 82
    if-nez p0, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    const/4 v3, 0x0

    .line 99
    :goto_2
    if-ge v3, v1, :cond_5

    .line 100
    .line 101
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Ldefpackage/ge;

    .line 106
    .line 107
    iget v5, v4, Ldefpackage/ge;->b:I

    .line 108
    .line 109
    iget v6, v4, Ldefpackage/ge;->c:I

    .line 110
    .line 111
    invoke-static {p1, p2, v5, v6}, Ldefpackage/ie;->a(IIII)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_4

    .line 116
    .line 117
    new-instance v5, Ldefpackage/ge;

    .line 118
    .line 119
    iget-object v7, v4, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 120
    .line 121
    iget v8, v4, Ldefpackage/ge;->b:I

    .line 122
    .line 123
    invoke-static {p1, v8}, Ljava/lang/Math;->max(II)I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    sub-int/2addr v8, p1

    .line 128
    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    sub-int/2addr v6, p1

    .line 133
    iget-object v4, v4, Ldefpackage/ge;->d:Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {v5, v8, v6, v7, v4}, Ldefpackage/ge;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_6

    .line 149
    .line 150
    :goto_3
    const/4 v0, 0x0

    .line 151
    :cond_6
    new-instance p0, Ldefpackage/he;

    .line 152
    .line 153
    invoke-direct {p0, v0, v2}, Ldefpackage/he;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
