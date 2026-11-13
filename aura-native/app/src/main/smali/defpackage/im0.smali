.class public final Ldefpackage/im0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final a:Ldefpackage/ll1;

.field public final b:I

.field public final c:I

.field public final d:Ldefpackage/vi0;

.field public final e:Ldefpackage/gu0;

.field public final f:Z

.field public final g:Ldefpackage/tp3;


# direct methods
.method public constructor <init>(IILdefpackage/db3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ldefpackage/ll1;->a()Ldefpackage/ll1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ldefpackage/im0;->a:Ldefpackage/ll1;

    .line 9
    .line 10
    iput p1, p0, Ldefpackage/im0;->b:I

    .line 11
    .line 12
    iput p2, p0, Ldefpackage/im0;->c:I

    .line 13
    .line 14
    sget-object p1, Ldefpackage/iu0;->f:Ldefpackage/ab3;

    .line 15
    .line 16
    invoke-virtual {p3, p1}, Ldefpackage/db3;->c(Ldefpackage/ab3;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ldefpackage/vi0;

    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/im0;->d:Ldefpackage/vi0;

    .line 23
    .line 24
    sget-object p1, Ldefpackage/gu0;->g:Ldefpackage/ab3;

    .line 25
    .line 26
    invoke-virtual {p3, p1}, Ldefpackage/db3;->c(Ldefpackage/ab3;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ldefpackage/gu0;

    .line 31
    .line 32
    iput-object p1, p0, Ldefpackage/im0;->e:Ldefpackage/gu0;

    .line 33
    .line 34
    sget-object p1, Ldefpackage/iu0;->i:Ldefpackage/ab3;

    .line 35
    .line 36
    invoke-virtual {p3, p1}, Ldefpackage/db3;->c(Ldefpackage/ab3;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p3, p1}, Ldefpackage/db3;->c(Ldefpackage/ab3;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 p1, 0x0

    .line 57
    :goto_0
    iput-boolean p1, p0, Ldefpackage/im0;->f:Z

    .line 58
    .line 59
    sget-object p1, Ldefpackage/iu0;->g:Ldefpackage/ab3;

    .line 60
    .line 61
    invoke-virtual {p3, p1}, Ldefpackage/db3;->c(Ldefpackage/ab3;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Ldefpackage/tp3;

    .line 66
    .line 67
    iput-object p1, p0, Ldefpackage/im0;->g:Ldefpackage/tp3;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 6

    .line 1
    iget-boolean p3, p0, Ldefpackage/im0;->f:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Ldefpackage/im0;->a:Ldefpackage/ll1;

    .line 5
    .line 6
    iget v2, p0, Ldefpackage/im0;->b:I

    .line 7
    .line 8
    iget v3, p0, Ldefpackage/im0;->c:I

    .line 9
    .line 10
    invoke-virtual {v1, v2, v3, p3, v0}, Ldefpackage/ll1;->c(IIZZ)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Ldefpackage/i3;->n(Landroid/graphics/ImageDecoder;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1}, Ldefpackage/i3;->A(Landroid/graphics/ImageDecoder;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object p3, p0, Ldefpackage/im0;->d:Ldefpackage/vi0;

    .line 24
    .line 25
    sget-object v0, Ldefpackage/vi0;->o:Ldefpackage/vi0;

    .line 26
    .line 27
    if-ne p3, v0, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Ldefpackage/i3;->D(Landroid/graphics/ImageDecoder;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance p3, Ldefpackage/hm0;

    .line 33
    .line 34
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p3}, Ldefpackage/i3;->p(Landroid/graphics/ImageDecoder;Ldefpackage/hm0;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2}, Ldefpackage/i3;->i(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/util/Size;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    const/high16 v0, -0x80000000

    .line 45
    .line 46
    if-ne v2, v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :cond_2
    if-ne v3, v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :cond_3
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v4, p0, Ldefpackage/im0;->e:Ldefpackage/gu0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1, v2, v3}, Ldefpackage/gu0;->b(IIII)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    int-to-float v1, v1

    .line 77
    mul-float/2addr v1, v0

    .line 78
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    int-to-float v2, v2

    .line 87
    mul-float/2addr v2, v0

    .line 88
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    const/4 v3, 0x2

    .line 93
    const-string v4, "ImageDecoder"

    .line 94
    .line 95
    invoke-static {v4, v3}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_4

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v5, "Resizing from ["

    .line 104
    .line 105
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v5, "x"

    .line 116
    .line 117
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p3, "] to ["

    .line 128
    .line 129
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string p3, "] scaleFactor: "

    .line 142
    .line 143
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    invoke-static {v4, p3}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    :cond_4
    invoke-static {p1, v1, v2}, Ldefpackage/i3;->o(Landroid/graphics/ImageDecoder;II)V

    .line 157
    .line 158
    .line 159
    iget-object p0, p0, Ldefpackage/im0;->g:Ldefpackage/tp3;

    .line 160
    .line 161
    if-eqz p0, :cond_7

    .line 162
    .line 163
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 164
    .line 165
    const/16 v0, 0x1c

    .line 166
    .line 167
    if-lt p3, v0, :cond_6

    .line 168
    .line 169
    sget-object p3, Ldefpackage/tp3;->n:Ldefpackage/tp3;

    .line 170
    .line 171
    if-ne p0, p3, :cond_5

    .line 172
    .line 173
    invoke-static {p2}, Ldefpackage/i3;->c(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-eqz p0, :cond_5

    .line 178
    .line 179
    invoke-static {p2}, Ldefpackage/i3;->c(Landroid/graphics/ImageDecoder$ImageInfo;)Landroid/graphics/ColorSpace;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-static {p0}, Ldefpackage/tn;->y(Landroid/graphics/ColorSpace;)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-eqz p0, :cond_5

    .line 188
    .line 189
    invoke-static {}, Ldefpackage/tn;->d()Landroid/graphics/ColorSpace$Named;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    goto :goto_1

    .line 194
    :cond_5
    invoke-static {}, Ldefpackage/tn;->A()Landroid/graphics/ColorSpace$Named;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    :goto_1
    invoke-static {p0}, Ldefpackage/tn;->e(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {p1, p0}, Ldefpackage/i3;->q(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_6
    const/16 p0, 0x1a

    .line 207
    .line 208
    if-lt p3, p0, :cond_7

    .line 209
    .line 210
    invoke-static {}, Ldefpackage/tn;->A()Landroid/graphics/ColorSpace$Named;

    .line 211
    .line 212
    .line 213
    invoke-static {}, Ldefpackage/gm0;->g()Landroid/graphics/ColorSpace;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-static {p1, p0}, Ldefpackage/i3;->q(Landroid/graphics/ImageDecoder;Landroid/graphics/ColorSpace;)V

    .line 218
    .line 219
    .line 220
    :cond_7
    return-void
.end method
