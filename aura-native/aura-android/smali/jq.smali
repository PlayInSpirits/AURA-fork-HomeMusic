.class public abstract Ljq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:I

.field public b:I

.field public c:[I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Ljq;->c:[I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const v2, 0x7f0705b4

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    new-array v7, v0, [I

    .line 21
    .line 22
    invoke-static {p1, p2, p3, p4}, Luc5;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 23
    .line 24
    .line 25
    sget-object v4, Lht3;->d:[I

    .line 26
    .line 27
    move-object v2, p1

    .line 28
    move-object v3, p2

    .line 29
    move v5, p3

    .line 30
    move v6, p4

    .line 31
    invoke-static/range {v2 .. v7}, Luc5;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/16 p2, 0x8

    .line 39
    .line 40
    invoke-static {v2, p1, p2, v1}, Lh12;->u(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Ljq;->a:I

    .line 45
    .line 46
    const/4 p2, 0x7

    .line 47
    invoke-static {v2, p1, p2, v0}, Lh12;->u(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget p3, p0, Ljq;->a:I

    .line 52
    .line 53
    const/4 p4, 0x2

    .line 54
    div-int/2addr p3, p4

    .line 55
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iput p2, p0, Ljq;->b:I

    .line 60
    .line 61
    const/4 p2, 0x4

    .line 62
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    iput p2, p0, Ljq;->e:I

    .line 67
    .line 68
    const/4 p2, 0x1

    .line 69
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    iput p3, p0, Ljq;->f:I

    .line 74
    .line 75
    invoke-virtual {p1, p4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    const/4 v1, -0x1

    .line 80
    if-nez p3, :cond_0

    .line 81
    .line 82
    const p2, 0x7f04012d

    .line 83
    .line 84
    .line 85
    invoke-static {v2, p2, v1}, Lg12;->s(Landroid/content/Context;II)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    filled-new-array {p2}, [I

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    iput-object p2, p0, Ljq;->c:[I

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {p1, p4}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    iget p3, p3, Landroid/util/TypedValue;->type:I

    .line 101
    .line 102
    if-eq p3, p2, :cond_1

    .line 103
    .line 104
    invoke-virtual {p1, p4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    filled-new-array {p2}, [I

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    iput-object p2, p0, Ljq;->c:[I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p1, p4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 120
    .line 121
    .line 122
    move-result p3

    .line 123
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getIntArray(I)[I

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    iput-object p2, p0, Ljq;->c:[I

    .line 128
    .line 129
    array-length p2, p2

    .line 130
    if-eqz p2, :cond_3

    .line 131
    .line 132
    :goto_0
    const/4 p2, 0x6

    .line 133
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-eqz p3, :cond_2

    .line 138
    .line 139
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    iput p2, p0, Ljq;->d:I

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_2
    iget-object p2, p0, Ljq;->c:[I

    .line 147
    .line 148
    aget p2, p2, v0

    .line 149
    .line 150
    iput p2, p0, Ljq;->d:I

    .line 151
    .line 152
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    const p3, 0x1010033

    .line 157
    .line 158
    .line 159
    filled-new-array {p3}, [I

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    invoke-virtual {p2, p3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    const p3, 0x3e4ccccd    # 0.2f

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 171
    .line 172
    .line 173
    move-result p3

    .line 174
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 175
    .line 176
    .line 177
    const/high16 p2, 0x437f0000    # 255.0f

    .line 178
    .line 179
    mul-float/2addr p3, p2

    .line 180
    float-to-int p2, p3

    .line 181
    iget p3, p0, Ljq;->d:I

    .line 182
    .line 183
    invoke-static {p3, p2}, Lg12;->l(II)I

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    iput p2, p0, Ljq;->d:I

    .line 188
    .line 189
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_3
    const-string p0, "indicatorColors cannot be empty when indicatorColor is not used."

    .line 194
    .line 195
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const/4 p0, 0x0

    .line 199
    throw p0
.end method


# virtual methods
.method public abstract a()V
.end method
