.class public abstract Lg12;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static a:B

.field public static final b:Ll50;

.field public static final c:Lca1;

.field public static final d:Ln7;

.field public static final e:Lf01;

.field public static f:Ljava/lang/reflect/Method;

.field public static g:Ljava/lang/reflect/Method;

.field public static h:Z


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll50;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "android"

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Ll50;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lg12;->b:Ll50;

    .line 10
    .line 11
    new-instance v0, Lca1;

    .line 12
    .line 13
    const/16 v1, 0xe

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lg12;->c:Lca1;

    .line 19
    .line 20
    new-instance v0, Ln7;

    .line 21
    .line 22
    const/16 v1, 0xf

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lg12;->d:Ln7;

    .line 28
    .line 29
    new-instance v0, Lf01;

    .line 30
    .line 31
    const-string v1, "NO_VALUE"

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v0, v2, v1}, Lf01;-><init>(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lg12;->e:Lf01;

    .line 38
    .line 39
    return-void
.end method

.method public static final A(Lu62;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lc72;->D()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static B(I)Z
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lv50;->e(I)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 8
    .line 9
    cmpl-double p0, v0, v2

    .line 10
    .line 11
    if-lez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static C(Ljava/lang/String;)Z
    .locals 4

    .line 1
    sget-object v0, Lm95;->a:Lte;

    .line 2
    .line 3
    sget-object v0, Lue;->c:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lue;

    .line 29
    .line 30
    iget-object v3, v2, Lue;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v2, 0x0

    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lue;

    .line 64
    .line 65
    invoke-virtual {v0}, Lue;->a()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Lue;->b()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    :cond_3
    const/4 p0, 0x1

    .line 78
    return p0

    .line 79
    :cond_4
    return v2

    .line 80
    :cond_5
    const-string v0, "Unknown feature "

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Ltb4;->e(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return v2
.end method

.method public static final D(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    and-long/2addr p0, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p0, p0, v0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final E(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    and-long/2addr p0, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p0, p0, v0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static F(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "("

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-string p1, ")"

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static H(IFI)I
    .locals 1

    .line 1
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    mul-float/2addr v0, p1

    .line 7
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p2, p1}, Lv50;->i(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1, p0}, Lv50;->g(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public static I(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v1, Ljava/text/Normalizer$Form;->NFD:Ljava/text/Normalizer$Form;

    .line 7
    .line 8
    invoke-static {p0, v1}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v1, "\\p{M}"

    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final J(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    instance-of v0, p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static N(Landroid/content/Context;II)I
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lzz1;->D(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget p1, p0, Landroid/util/TypedValue;->type:I

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Landroid/util/TypedValue;->data:I

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    return p2
.end method

.method public static O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;
    .locals 6

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    return-object p2

    .line 18
    :cond_0
    iget p1, v0, Landroid/util/TypedValue;->type:I

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    const/4 v1, 0x3

    .line 22
    if-ne p1, v1, :cond_6

    .line 23
    .line 24
    iget-object p1, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v3, "cubic-bezier"

    .line 31
    .line 32
    invoke-static {p1, v3}, Lg12;->F(Ljava/lang/String;Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const-string v5, "path"

    .line 37
    .line 38
    if-nez v4, :cond_2

    .line 39
    .line 40
    invoke-static {p1, v5}, Lg12;->F(Ljava/lang/String;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget p1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 48
    .line 49
    invoke-static {p0, p1}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_2
    :goto_0
    invoke-static {p1, v3}, Lg12;->F(Ljava/lang/String;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    sub-int/2addr p0, v2

    .line 65
    const/16 v0, 0xd

    .line 66
    .line 67
    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string p1, ","

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    array-length p1, p0

    .line 78
    const/4 v0, 0x4

    .line 79
    if-ne p1, v0, :cond_3

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    invoke-static {p0, p1}, Lg12;->w([Ljava/lang/String;I)F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-static {p0, v2}, Lg12;->w([Ljava/lang/String;I)F

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    const/4 v0, 0x2

    .line 91
    invoke-static {p0, v0}, Lg12;->w([Ljava/lang/String;I)F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {p0, v1}, Lg12;->w([Ljava/lang/String;I)F

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    new-instance v1, Landroid/view/animation/PathInterpolator;

    .line 100
    .line 101
    invoke-direct {v1, p1, p2, v0, p0}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_3
    const-string p1, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "

    .line 106
    .line 107
    array-length p0, p0

    .line 108
    invoke-static {p0, p1}, Lmj0;->f(ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object p2

    .line 112
    :cond_4
    invoke-static {p1, v5}, Lg12;->F(Ljava/lang/String;Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_5

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    sub-int/2addr p0, v2

    .line 123
    const/4 v0, 0x5

    .line 124
    invoke-virtual {p1, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    new-instance p1, Landroid/graphics/Path;

    .line 129
    .line 130
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-static {p0}, Lfh0;->l(Ljava/lang/String;)[Lcf3;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :try_start_0
    invoke-static {v0, p1}, Lcf3;->b([Lcf3;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .line 139
    .line 140
    new-instance p0, Landroid/view/animation/PathInterpolator;

    .line 141
    .line 142
    invoke-direct {p0, p1}, Landroid/view/animation/PathInterpolator;-><init>(Landroid/graphics/Path;)V

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :catch_0
    move-exception p1

    .line 147
    const-string v0, "Error in parsing "

    .line 148
    .line 149
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p0, p1}, Lnz2;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    return-object p2

    .line 157
    :cond_5
    const-string p0, "Invalid motion easing type: "

    .line 158
    .line 159
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object p2

    .line 167
    :cond_6
    const-string p0, "Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes."

    .line 168
    .line 169
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-object p2
.end method

.method public static final P(Lcom/eddyizm/tempus/model/Favorite;)Z
    .locals 9

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "homemusic_favorite_retries"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Favorite;->getTimestamp()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Favorite;->getTimestamp()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    const-string v4, "legacyfav:"

    .line 32
    .line 33
    invoke-static {v4, v0, v1}, Lb11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Favorite;->getSongId()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v4, 0x1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    move v1, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Favorite;->getAlbumId()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v1, 0x3

    .line 55
    :goto_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Favorite;->getSongId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Favorite;->getAlbumId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-nez v5, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Favorite;->getArtistId()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    :cond_3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Favorite;->getToStar()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    sget-object v6, Ln61;->a:Ljava/util/HashMap;

    .line 76
    .line 77
    const-class v6, Ln61;

    .line 78
    .line 79
    monitor-enter v6

    .line 80
    if-nez v5, :cond_4

    .line 81
    .line 82
    monitor-exit v6

    .line 83
    return v2

    .line 84
    :cond_4
    :try_start_0
    sget-object v7, Ln61;->a:Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-static {v1, v5}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_7

    .line 95
    .line 96
    invoke-static {v1, v5}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v7, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Ll61;

    .line 105
    .line 106
    :goto_1
    if-eqz p0, :cond_5

    .line 107
    .line 108
    iget-boolean v1, p0, Ll61;->e:Z

    .line 109
    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    iget-object p0, p0, Ll61;->c:Ll61;

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    if-eqz p0, :cond_6

    .line 116
    .line 117
    iget-object p0, p0, Ll61;->f:Lk61;

    .line 118
    .line 119
    iget-object p0, p0, Lk61;->d:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    if-eqz p0, :cond_6

    .line 126
    .line 127
    move v2, v4

    .line 128
    goto :goto_2

    .line 129
    :catchall_0
    move-exception p0

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    :goto_2
    monitor-exit v6

    .line 132
    return v2

    .line 133
    :cond_7
    :try_start_1
    new-instance v2, Lk61;

    .line 134
    .line 135
    invoke-direct {v2, v5, v1, v0, p0}, Lk61;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v5}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, Ll61;

    .line 143
    .line 144
    invoke-direct {v1, v0, p0, v3, v2}, Ll61;-><init>(Ljava/lang/String;ZLl61;Lk61;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    .line 149
    .line 150
    monitor-exit v6

    .line 151
    return v4

    .line 152
    :goto_3
    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 153
    throw p0
.end method

.method public static final Q(Lwf1;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 2
    .line 3
    .line 4
    new-instance v0, Le73;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Le73;-><init>(Lwf1;Lvd0;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lq01;->n:Lq01;

    .line 11
    .line 12
    invoke-static {p0, v0}, Lfu;->L(Lne0;Lwf1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static R(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcr4;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/api/Status;->n:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lcr4;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/Status;->p:Landroid/app/PendingIntent;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    new-instance p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p2, p1}, Lcr4;->a(Lcom/google/android/gms/common/api/ApiException;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static S(S)[B
    .locals 3

    .line 1
    and-int/lit16 v0, p0, 0xff

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    shr-int/lit8 p0, p0, 0x8

    .line 5
    .line 6
    and-int/lit16 p0, p0, 0xff

    .line 7
    .line 8
    int-to-byte p0, p0

    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-byte v0, v1, v2

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aput-byte p0, v1, v0

    .line 17
    .line 18
    return-object v1
.end method

.method public static T(I)I
    .locals 4

    .line 1
    int-to-long v0, p0

    .line 2
    const-wide/32 v2, -0x3361d2af

    .line 3
    .line 4
    .line 5
    mul-long/2addr v0, v2

    .line 6
    long-to-int p0, v0

    .line 7
    const/16 v0, 0xf

    .line 8
    .line 9
    invoke-static {p0, v0}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    int-to-long v0, p0

    .line 14
    const-wide/32 v2, 0x1b873593

    .line 15
    .line 16
    .line 17
    mul-long/2addr v0, v2

    .line 18
    long-to-int p0, v0

    .line 19
    return p0
.end method

.method public static U(Ljava/lang/Object;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    :goto_0
    invoke-static {p0}, Lg12;->T(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final a(IILwv;)Lcd4;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p0, :cond_4

    .line 3
    .line 4
    if-ltz p1, :cond_3

    .line 5
    .line 6
    if-gtz p0, :cond_1

    .line 7
    .line 8
    if-gtz p1, :cond_1

    .line 9
    .line 10
    sget-object v1, Lwv;->n:Lwv;

    .line 11
    .line 12
    if-ne p2, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "

    .line 16
    .line 17
    invoke-static {p2, p0}, Lnz2;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    :goto_0
    add-int/2addr p1, p0

    .line 22
    if-gez p1, :cond_2

    .line 23
    .line 24
    const p1, 0x7fffffff

    .line 25
    .line 26
    .line 27
    :cond_2
    new-instance v0, Lcd4;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1, p2}, Lcd4;-><init>(IILwv;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_3
    const-string p0, "extraBufferCapacity cannot be negative, but was "

    .line 34
    .line 35
    invoke-static {p1, p0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_4
    const-string p1, "replay cannot be negative, but was "

    .line 44
    .line 45
    invoke-static {p0, p1}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public static b(I)[B
    .locals 5

    .line 1
    and-int/lit16 v0, p0, 0xff

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    shr-int/lit8 v1, p0, 0x8

    .line 5
    .line 6
    and-int/lit16 v1, v1, 0xff

    .line 7
    .line 8
    int-to-byte v1, v1

    .line 9
    shr-int/lit8 v2, p0, 0x10

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0xff

    .line 12
    .line 13
    int-to-byte v2, v2

    .line 14
    shr-int/lit8 p0, p0, 0x18

    .line 15
    .line 16
    and-int/lit16 p0, p0, 0xff

    .line 17
    .line 18
    int-to-byte p0, p0

    .line 19
    const/4 v3, 0x4

    .line 20
    new-array v3, v3, [B

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    aput-byte v0, v3, v4

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    aput-byte v1, v3, v0

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    aput-byte v2, v3, v0

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    aput-byte p0, v3, v0

    .line 33
    .line 34
    return-object v3
.end method

.method public static final c(JJ)F
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p2, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p0, v0

    .line 11
    .line 12
    long-to-int v0, v2

    .line 13
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    div-float/2addr v1, v0

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p2, v2

    .line 24
    long-to-int p2, p2

    .line 25
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    and-long/2addr p0, v2

    .line 30
    long-to-int p0, p0

    .line 31
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    div-float/2addr p2, p0

    .line 36
    invoke-static {v1, p2}, Ljava/lang/Math;->min(FF)F

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public static final d([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    .line 1
    long-to-int p1, p1

    .line 2
    array-length p2, p0

    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    and-int/2addr p1, p2

    .line 6
    aput-object p3, p0, p1

    .line 7
    .line 8
    return-void
.end method

.method public static f(Lvo4;[Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    array-length v0, p1

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_c

    .line 8
    .line 9
    aget-object v2, p1, v1

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-interface {p0, v1}, Lvo4;->e(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    instance-of v3, v2, [B

    .line 20
    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    check-cast v2, [B

    .line 24
    .line 25
    invoke-interface {p0, v1, v2}, Lvo4;->x(I[B)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    instance-of v3, v2, Ljava/lang/Float;

    .line 30
    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    check-cast v2, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    float-to-double v2, v2

    .line 40
    invoke-interface {p0, v2, v3, v1}, Lvo4;->d(DI)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    instance-of v3, v2, Ljava/lang/Double;

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    check-cast v2, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-interface {p0, v2, v3, v1}, Lvo4;->d(DI)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    instance-of v3, v2, Ljava/lang/Long;

    .line 59
    .line 60
    if-eqz v3, :cond_5

    .line 61
    .line 62
    check-cast v2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    invoke-interface {p0, v1, v2, v3}, Lvo4;->c(IJ)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    instance-of v3, v2, Ljava/lang/Integer;

    .line 73
    .line 74
    if-eqz v3, :cond_6

    .line 75
    .line 76
    check-cast v2, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    int-to-long v2, v2

    .line 83
    invoke-interface {p0, v1, v2, v3}, Lvo4;->c(IJ)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_6
    instance-of v3, v2, Ljava/lang/Short;

    .line 88
    .line 89
    if-eqz v3, :cond_7

    .line 90
    .line 91
    check-cast v2, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Number;->shortValue()S

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    int-to-long v2, v2

    .line 98
    invoke-interface {p0, v1, v2, v3}, Lvo4;->c(IJ)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_7
    instance-of v3, v2, Ljava/lang/Byte;

    .line 103
    .line 104
    if-eqz v3, :cond_8

    .line 105
    .line 106
    check-cast v2, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Number;->byteValue()B

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    int-to-long v2, v2

    .line 113
    invoke-interface {p0, v1, v2, v3}, Lvo4;->c(IJ)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_8
    instance-of v3, v2, Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v3, :cond_9

    .line 120
    .line 121
    check-cast v2, Ljava/lang/String;

    .line 122
    .line 123
    invoke-interface {p0, v1, v2}, Lvo4;->h(ILjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_9
    instance-of v3, v2, Ljava/lang/Boolean;

    .line 128
    .line 129
    if-eqz v3, :cond_b

    .line 130
    .line 131
    check-cast v2, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_a

    .line 138
    .line 139
    const-wide/16 v2, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_a
    const-wide/16 v2, 0x0

    .line 143
    .line 144
    :goto_1
    invoke-interface {p0, v1, v2, v3}, Lvo4;->c(IJ)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 150
    .line 151
    new-instance p1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v0, "Cannot bind "

    .line 154
    .line 155
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v0, " at index "

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v0, " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String"

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p0

    .line 182
    :cond_c
    :goto_2
    return-void
.end method

.method public static j(C)[B
    .locals 3

    .line 1
    and-int/lit16 v0, p0, 0xff

    .line 2
    .line 3
    int-to-byte v0, v0

    .line 4
    shr-int/lit8 p0, p0, 0x8

    .line 5
    .line 6
    and-int/lit16 p0, p0, 0xff

    .line 7
    .line 8
    int-to-byte p0, p0

    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-byte v0, v1, v2

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aput-byte p0, v1, v0

    .line 17
    .line 18
    return-object v1
.end method

.method public static final k(JJ)I
    .locals 5

    .line 1
    invoke-static {p0, p1}, Lg12;->E(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2, p3}, Lg12;->E(J)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, -0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    return v2

    .line 17
    :cond_1
    invoke-static {p0, p1}, Lg12;->u(J)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {p2, p3}, Lg12;->u(J)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-float/2addr v0, v1

    .line 26
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    float-to-int v0, v0

    .line 31
    invoke-static {p0, p1}, Lg12;->u(J)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {p2, p3}, Lg12;->u(J)F

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v4, 0x0

    .line 44
    cmpg-float v1, v1, v4

    .line 45
    .line 46
    if-gez v1, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p0, p1}, Lg12;->D(J)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {p2, p3}, Lg12;->D(J)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eq v1, p2, :cond_4

    .line 58
    .line 59
    invoke-static {p0, p1}, Lg12;->D(J)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    return v3

    .line 66
    :cond_3
    return v2

    .line 67
    :cond_4
    :goto_0
    return v0
.end method

.method public static l(II)I
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/2addr v0, p1

    .line 6
    div-int/lit16 v0, v0, 0xff

    .line 7
    .line 8
    invoke-static {p0, v0}, Lv50;->i(II)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public static m(Ldf;Ljava/util/Map;)[B
    .locals 12

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_e

    .line 11
    .line 12
    new-instance v0, Ll50;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/16 v3, 0x7f

    .line 19
    .line 20
    invoke-direct {v0, v3, v2}, Ll50;-><init>(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    move-object v4, v1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v5, :cond_4

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/util/Map$Entry;

    .line 49
    .line 50
    new-instance v5, Lj50;

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-virtual {p0}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    check-cast v9, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    check-cast v9, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    invoke-direct {v5, v8, v7, v9}, Lj50;-><init>(Ljava/lang/String;II)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-virtual {v7, v4}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v7, "color"

    .line 112
    .line 113
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_3

    .line 118
    .line 119
    iget-byte v4, v5, Lj50;->a:B

    .line 120
    .line 121
    if-ne v4, v6, :cond_0

    .line 122
    .line 123
    sget-object v4, Lg12;->b:Ll50;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_0
    if-ne v4, v3, :cond_2

    .line 127
    .line 128
    move-object v4, v0

    .line 129
    :goto_1
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-nez v6, :cond_1

    .line 134
    .line 135
    new-instance v6, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_1
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    check-cast v4, Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-object v4, v5

    .line 153
    goto :goto_0

    .line 154
    :cond_2
    const-string p0, "Not supported with unknown package id: "

    .line 155
    .line 156
    invoke-static {v4, p0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_3
    const-string p0, "Non color resource found: name="

    .line 165
    .line 166
    const-string p1, ", typeId="

    .line 167
    .line 168
    invoke-static {p0, v8, p1}, Lxa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    iget-byte p1, v5, Lj50;->b:B

    .line 173
    .line 174
    and-int/lit16 p1, p1, 0xff

    .line 175
    .line 176
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1, p0}, Lkf2;->g(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 181
    .line 182
    .line 183
    return-object v1

    .line 184
    :cond_4
    iget-byte p0, v4, Lj50;->b:B

    .line 185
    .line 186
    sput-byte p0, Lg12;->a:B

    .line 187
    .line 188
    if-eqz p0, :cond_d

    .line 189
    .line 190
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 191
    .line 192
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 193
    .line 194
    .line 195
    new-instance p1, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    new-instance v1, Lo50;

    .line 205
    .line 206
    const/4 v3, 0x0

    .line 207
    new-array v4, v3, [Ljava/lang/String;

    .line 208
    .line 209
    invoke-direct {v1, v4, v3}, Lo50;-><init>([Ljava/lang/String;Z)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_5

    .line 225
    .line 226
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Ljava/util/Map$Entry;

    .line 231
    .line 232
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    check-cast v5, Ljava/util/List;

    .line 237
    .line 238
    sget-object v7, Lg12;->c:Lca1;

    .line 239
    .line 240
    invoke-static {v5, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 241
    .line 242
    .line 243
    new-instance v7, Lk50;

    .line 244
    .line 245
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    check-cast v4, Ll50;

    .line 250
    .line 251
    invoke-direct {v7, v4, v5}, Lk50;-><init>(Ll50;Ljava/util/List;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    move v4, v3

    .line 263
    move v5, v4

    .line 264
    :goto_3
    if-ge v5, v2, :cond_6

    .line 265
    .line 266
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    add-int/lit8 v5, v5, 0x1

    .line 271
    .line 272
    check-cast v7, Lk50;

    .line 273
    .line 274
    invoke-virtual {v7}, Lk50;->a()I

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    add-int/2addr v4, v7

    .line 279
    goto :goto_3

    .line 280
    :cond_6
    iget v2, v1, Lo50;->l:I

    .line 281
    .line 282
    const/16 v5, 0xc

    .line 283
    .line 284
    add-int/2addr v2, v5

    .line 285
    add-int/2addr v2, v4

    .line 286
    const/4 v4, 0x2

    .line 287
    invoke-static {v4}, Lg12;->S(S)[B

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-virtual {p0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 292
    .line 293
    .line 294
    invoke-static {v5}, Lg12;->S(S)[B

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-virtual {p0, v5}, Ljava/io/OutputStream;->write([B)V

    .line 299
    .line 300
    .line 301
    invoke-static {v2}, Lg12;->b(I)[B

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write([B)V

    .line 306
    .line 307
    .line 308
    invoke-static {v0}, Lg12;->b(I)[B

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, p0}, Lo50;->a(Ljava/io/ByteArrayOutputStream;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    move v1, v3

    .line 323
    :cond_7
    if-ge v1, v0, :cond_c

    .line 324
    .line 325
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    add-int/lit8 v1, v1, 0x1

    .line 330
    .line 331
    check-cast v2, Lk50;

    .line 332
    .line 333
    iget-object v5, v2, Lk50;->c:Lo50;

    .line 334
    .line 335
    iget-object v7, v2, Lk50;->a:Lm50;

    .line 336
    .line 337
    invoke-virtual {v7, p0}, Lm50;->a(Ljava/io/ByteArrayOutputStream;)V

    .line 338
    .line 339
    .line 340
    iget-object v7, v2, Lk50;->b:Ll50;

    .line 341
    .line 342
    iget v8, v7, Ll50;->a:I

    .line 343
    .line 344
    invoke-static {v8}, Lg12;->b(I)[B

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    invoke-virtual {p0, v8}, Ljava/io/OutputStream;->write([B)V

    .line 349
    .line 350
    .line 351
    iget-object v7, v7, Ll50;->b:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v7}, Ljava/lang/String;->toCharArray()[C

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    move v8, v3

    .line 358
    :goto_4
    const/16 v9, 0x80

    .line 359
    .line 360
    if-ge v8, v9, :cond_9

    .line 361
    .line 362
    array-length v9, v7

    .line 363
    if-ge v8, v9, :cond_8

    .line 364
    .line 365
    aget-char v9, v7, v8

    .line 366
    .line 367
    invoke-static {v9}, Lg12;->j(C)[B

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    invoke-virtual {p0, v9}, Ljava/io/OutputStream;->write([B)V

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_8
    invoke-static {v3}, Lg12;->j(C)[B

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    invoke-virtual {p0, v9}, Ljava/io/OutputStream;->write([B)V

    .line 380
    .line 381
    .line 382
    :goto_5
    add-int/lit8 v8, v8, 0x1

    .line 383
    .line 384
    goto :goto_4

    .line 385
    :cond_9
    const/16 v7, 0x120

    .line 386
    .line 387
    invoke-static {v7}, Lg12;->b(I)[B

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    invoke-virtual {p0, v8}, Ljava/io/OutputStream;->write([B)V

    .line 392
    .line 393
    .line 394
    invoke-static {v3}, Lg12;->b(I)[B

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    invoke-virtual {p0, v8}, Ljava/io/OutputStream;->write([B)V

    .line 399
    .line 400
    .line 401
    iget v8, v5, Lo50;->l:I

    .line 402
    .line 403
    add-int/2addr v8, v7

    .line 404
    invoke-static {v8}, Lg12;->b(I)[B

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    invoke-virtual {p0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 409
    .line 410
    .line 411
    invoke-static {v3}, Lg12;->b(I)[B

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    invoke-virtual {p0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 416
    .line 417
    .line 418
    invoke-static {v3}, Lg12;->b(I)[B

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    invoke-virtual {p0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v5, p0}, Lo50;->a(Ljava/io/ByteArrayOutputStream;)V

    .line 426
    .line 427
    .line 428
    iget-object v5, v2, Lk50;->d:Lo50;

    .line 429
    .line 430
    invoke-virtual {v5, p0}, Lo50;->a(Ljava/io/ByteArrayOutputStream;)V

    .line 431
    .line 432
    .line 433
    iget-object v2, v2, Lk50;->e:Lgc;

    .line 434
    .line 435
    iget-object v5, v2, Lgc;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v5, Lm50;

    .line 438
    .line 439
    invoke-virtual {v5, p0}, Lm50;->a(Ljava/io/ByteArrayOutputStream;)V

    .line 440
    .line 441
    .line 442
    const/4 v5, 0x4

    .line 443
    new-array v7, v5, [B

    .line 444
    .line 445
    sget-byte v8, Lg12;->a:B

    .line 446
    .line 447
    aput-byte v8, v7, v3

    .line 448
    .line 449
    aput-byte v3, v7, v6

    .line 450
    .line 451
    aput-byte v3, v7, v4

    .line 452
    .line 453
    const/4 v8, 0x3

    .line 454
    aput-byte v3, v7, v8

    .line 455
    .line 456
    invoke-virtual {p0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 457
    .line 458
    .line 459
    iget v7, v2, Lgc;->a:I

    .line 460
    .line 461
    invoke-static {v7}, Lg12;->b(I)[B

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    invoke-virtual {p0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 466
    .line 467
    .line 468
    iget-object v7, v2, Lgc;->c:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v7, [I

    .line 471
    .line 472
    array-length v9, v7

    .line 473
    move v10, v3

    .line 474
    :goto_6
    if-ge v10, v9, :cond_a

    .line 475
    .line 476
    aget v11, v7, v10

    .line 477
    .line 478
    invoke-static {v11}, Lg12;->b(I)[B

    .line 479
    .line 480
    .line 481
    move-result-object v11

    .line 482
    invoke-virtual {p0, v11}, Ljava/io/OutputStream;->write([B)V

    .line 483
    .line 484
    .line 485
    add-int/lit8 v10, v10, 0x1

    .line 486
    .line 487
    goto :goto_6

    .line 488
    :cond_a
    iget-object v2, v2, Lgc;->d:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v2, Lew4;

    .line 491
    .line 492
    iget-object v7, v2, Lew4;->p:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v7, Lm50;

    .line 495
    .line 496
    iget-object v9, v2, Lew4;->r:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v9, [I

    .line 499
    .line 500
    invoke-virtual {v7, p0}, Lm50;->a(Ljava/io/ByteArrayOutputStream;)V

    .line 501
    .line 502
    .line 503
    new-array v7, v5, [B

    .line 504
    .line 505
    sget-byte v10, Lg12;->a:B

    .line 506
    .line 507
    aput-byte v10, v7, v3

    .line 508
    .line 509
    aput-byte v3, v7, v6

    .line 510
    .line 511
    aput-byte v3, v7, v4

    .line 512
    .line 513
    aput-byte v3, v7, v8

    .line 514
    .line 515
    invoke-virtual {p0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 516
    .line 517
    .line 518
    iget v7, v2, Lew4;->o:I

    .line 519
    .line 520
    invoke-static {v7}, Lg12;->b(I)[B

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    invoke-virtual {p0, v7}, Ljava/io/OutputStream;->write([B)V

    .line 525
    .line 526
    .line 527
    array-length v7, v9

    .line 528
    mul-int/2addr v7, v5

    .line 529
    add-int/lit8 v7, v7, 0x54

    .line 530
    .line 531
    invoke-static {v7}, Lg12;->b(I)[B

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    invoke-virtual {p0, v5}, Ljava/io/OutputStream;->write([B)V

    .line 536
    .line 537
    .line 538
    iget-object v5, v2, Lew4;->q:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v5, [B

    .line 541
    .line 542
    invoke-virtual {p0, v5}, Ljava/io/OutputStream;->write([B)V

    .line 543
    .line 544
    .line 545
    array-length v5, v9

    .line 546
    move v7, v3

    .line 547
    :goto_7
    if-ge v7, v5, :cond_b

    .line 548
    .line 549
    aget v8, v9, v7

    .line 550
    .line 551
    invoke-static {v8}, Lg12;->b(I)[B

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    invoke-virtual {p0, v8}, Ljava/io/OutputStream;->write([B)V

    .line 556
    .line 557
    .line 558
    add-int/lit8 v7, v7, 0x1

    .line 559
    .line 560
    goto :goto_7

    .line 561
    :cond_b
    iget-object v2, v2, Lew4;->s:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v2, [Ln50;

    .line 564
    .line 565
    array-length v5, v2

    .line 566
    move v7, v3

    .line 567
    :goto_8
    if-ge v7, v5, :cond_7

    .line 568
    .line 569
    aget-object v8, v2, v7

    .line 570
    .line 571
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    const/16 v9, 0x8

    .line 575
    .line 576
    invoke-static {v9}, Lg12;->S(S)[B

    .line 577
    .line 578
    .line 579
    move-result-object v10

    .line 580
    invoke-virtual {p0, v10}, Ljava/io/OutputStream;->write([B)V

    .line 581
    .line 582
    .line 583
    invoke-static {v4}, Lg12;->S(S)[B

    .line 584
    .line 585
    .line 586
    move-result-object v10

    .line 587
    invoke-virtual {p0, v10}, Ljava/io/OutputStream;->write([B)V

    .line 588
    .line 589
    .line 590
    iget v10, v8, Ln50;->a:I

    .line 591
    .line 592
    invoke-static {v10}, Lg12;->b(I)[B

    .line 593
    .line 594
    .line 595
    move-result-object v10

    .line 596
    invoke-virtual {p0, v10}, Ljava/io/OutputStream;->write([B)V

    .line 597
    .line 598
    .line 599
    invoke-static {v9}, Lg12;->S(S)[B

    .line 600
    .line 601
    .line 602
    move-result-object v9

    .line 603
    invoke-virtual {p0, v9}, Ljava/io/OutputStream;->write([B)V

    .line 604
    .line 605
    .line 606
    new-array v9, v4, [B

    .line 607
    .line 608
    fill-array-data v9, :array_0

    .line 609
    .line 610
    .line 611
    invoke-virtual {p0, v9}, Ljava/io/OutputStream;->write([B)V

    .line 612
    .line 613
    .line 614
    iget v8, v8, Ln50;->b:I

    .line 615
    .line 616
    invoke-static {v8}, Lg12;->b(I)[B

    .line 617
    .line 618
    .line 619
    move-result-object v8

    .line 620
    invoke-virtual {p0, v8}, Ljava/io/OutputStream;->write([B)V

    .line 621
    .line 622
    .line 623
    add-int/lit8 v7, v7, 0x1

    .line 624
    .line 625
    goto :goto_8

    .line 626
    :cond_c
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 627
    .line 628
    .line 629
    move-result-object p0

    .line 630
    return-object p0

    .line 631
    :cond_d
    const-string p0, "No color resources found for harmonization."

    .line 632
    .line 633
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    return-object v1

    .line 637
    :cond_e
    const-string p0, "No color resources provided for harmonization."

    .line 638
    .line 639
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    return-object v1

    .line 643
    :array_0
    .array-data 1
        0x0t
        0x1ct
    .end array-data
.end method

.method public static n(Landroid/graphics/Canvas;Z)V
    .locals 11

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lkz;->z(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {p0}, Lkz;->C(Landroid/graphics/Canvas;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    sget-boolean v1, Lg12;->h:Z

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_5

    .line 21
    .line 22
    const/16 v1, 0x1c

    .line 23
    .line 24
    const-string v3, "insertInorderBarrier"

    .line 25
    .line 26
    const-string v4, "insertReorderBarrier"

    .line 27
    .line 28
    const-class v5, Landroid/graphics/Canvas;

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    if-ne v0, v1, :cond_2

    .line 32
    .line 33
    :try_start_0
    const-class v0, Ljava/lang/Class;

    .line 34
    .line 35
    const-string v1, "getDeclaredMethod"

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    new-array v8, v7, [Ljava/lang/Class;

    .line 39
    .line 40
    const-class v9, Ljava/lang/String;

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    aput-object v9, v8, v10

    .line 44
    .line 45
    new-array v9, v10, [Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    aput-object v9, v8, v6

    .line 52
    .line 53
    invoke-virtual {v0, v1, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-array v1, v7, [Ljava/lang/Object;

    .line 58
    .line 59
    aput-object v4, v1, v10

    .line 60
    .line 61
    new-array v4, v10, [Ljava/lang/Class;

    .line 62
    .line 63
    aput-object v4, v1, v6

    .line 64
    .line 65
    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    sput-object v1, Lg12;->f:Ljava/lang/reflect/Method;

    .line 72
    .line 73
    new-array v1, v7, [Ljava/lang/Object;

    .line 74
    .line 75
    aput-object v3, v1, v10

    .line 76
    .line 77
    new-array v3, v10, [Ljava/lang/Class;

    .line 78
    .line 79
    aput-object v3, v1, v6

    .line 80
    .line 81
    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/reflect/Method;

    .line 86
    .line 87
    sput-object v0, Lg12;->g:Ljava/lang/reflect/Method;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    invoke-virtual {v5, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sput-object v0, Lg12;->f:Ljava/lang/reflect/Method;

    .line 95
    .line 96
    invoke-virtual {v5, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lg12;->g:Ljava/lang/reflect/Method;

    .line 101
    .line 102
    :goto_0
    sget-object v0, Lg12;->f:Ljava/lang/reflect/Method;

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 107
    .line 108
    .line 109
    :cond_3
    sget-object v0, Lg12;->g:Ljava/lang/reflect/Method;

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    .line 116
    :catch_0
    :cond_4
    sput-boolean v6, Lg12;->h:Z

    .line 117
    .line 118
    :cond_5
    if-eqz p1, :cond_6

    .line 119
    .line 120
    :try_start_1
    sget-object v0, Lg12;->f:Ljava/lang/reflect/Method;

    .line 121
    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_6
    if-nez p1, :cond_7

    .line 128
    .line 129
    sget-object p1, Lg12;->g:Ljava/lang/reflect/Method;

    .line 130
    .line 131
    if-eqz p1, :cond_7

    .line 132
    .line 133
    invoke-virtual {p1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 134
    .line 135
    .line 136
    :catch_1
    :cond_7
    return-void
.end method

.method public static final o(Lzc4;Lne0;ILwv;)Lp81;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x3

    .line 4
    if-ne p2, v0, :cond_1

    .line 5
    .line 6
    :cond_0
    sget-object v0, Lwv;->n:Lwv;

    .line 7
    .line 8
    if-ne p3, v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    new-instance v0, Lb10;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2, p3}, La10;-><init>(Lp81;Lne0;ILwv;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static r(ILandroid/content/Context;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lzz1;->F(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p2, p0, Landroid/util/TypedValue;->resourceId:I

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget p0, p0, Landroid/util/TypedValue;->data:I

    .line 15
    .line 16
    return p0
.end method

.method public static s(Landroid/content/Context;II)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzz1;->D(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget p2, p1, Landroid/util/TypedValue;->resourceId:I

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Landroid/content/Context;->getColor(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    iget p0, p1, Landroid/util/TypedValue;->data:I

    .line 17
    .line 18
    return p0

    .line 19
    :cond_1
    return p2
.end method

.method public static t(Landroid/view/View;I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1, v1, p0}, Lzz1;->F(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget p1, p0, Landroid/util/TypedValue;->resourceId:I

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/content/Context;->getColor(I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_0
    iget p0, p0, Landroid/util/TypedValue;->data:I

    .line 31
    .line 32
    return p0
.end method

.method public static final u(J)F
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long/2addr p0, v0

    .line 4
    long-to-int p0, p0

    .line 5
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static v(Landroid/content/Context;)Lis0;
    .locals 8

    .line 1
    const v0, 0x1010214

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    new-instance v2, Landroid/graphics/drawable/InsetDrawable;

    .line 18
    .line 19
    const/16 v6, 0x2a

    .line 20
    .line 21
    const/16 v7, 0x2a

    .line 22
    .line 23
    const/16 v4, 0x2a

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-direct/range {v2 .. v7}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lis0;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lis0;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, v0, Lis0;->a:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    return-object v0
.end method

.method public static w([Ljava/lang/String;I)F
    .locals 1

    .line 1
    aget-object p0, p0, p1

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 p1, 0x0

    .line 8
    cmpg-float v0, p0, p1

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    cmpl-float v0, p0, v0

    .line 15
    .line 16
    if-gtz v0, :cond_0

    .line 17
    .line 18
    return p0

    .line 19
    :cond_0
    const-string v0, "Motion easing control point value must be between 0 and 1; instead got: "

    .line 20
    .line 21
    invoke-static {v0, p0}, Ltb4;->f(Ljava/lang/String;F)V

    .line 22
    .line 23
    .line 24
    return p1
.end method

.method public static x(Ljava/util/Date;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const v0, 0x7f130524

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 16
    .line 17
    const-string v1, "dd MMM, yyyy"

    .line 18
    .line 19
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static y(II)I
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    :cond_0
    div-int v0, p0, p1

    .line 5
    .line 6
    if-lez v0, :cond_1

    .line 7
    .line 8
    return p1

    .line 9
    :cond_1
    rem-int/2addr p0, p1

    .line 10
    return p0
.end method

.method public static z(II)Ljava/text/SimpleDateFormat;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "Unknown DateFormat style: "

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    if-eq p0, v5, :cond_2

    .line 15
    .line 16
    if-eq p0, v4, :cond_1

    .line 17
    .line 18
    if-ne p0, v3, :cond_0

    .line 19
    .line 20
    const-string p0, "M/d/yy"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p0, v2}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    const-string p0, "MMM d, yyyy"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string p0, "MMMM d, yyyy"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    const-string p0, "EEEE, MMMM d, yyyy"

    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, " "

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    if-eqz p1, :cond_6

    .line 48
    .line 49
    if-eq p1, v5, :cond_6

    .line 50
    .line 51
    if-eq p1, v4, :cond_5

    .line 52
    .line 53
    if-ne p1, v3, :cond_4

    .line 54
    .line 55
    const-string p0, "h:mm a"

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    invoke-static {p1, v2}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_5
    const-string p0, "h:mm:ss a"

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_6
    const-string p0, "h:mm:ss a z"

    .line 70
    .line 71
    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 79
    .line 80
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 81
    .line 82
    invoke-direct {p1, p0, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 83
    .line 84
    .line 85
    return-object p1
.end method


# virtual methods
.method public G()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract K(Lt0;Lt0;)V
.end method

.method public abstract L(Lt0;Ljava/lang/Thread;)V
.end method

.method public M(Landroid/content/Context;Lcom/bumptech/glide/a;Ley3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Landroid/content/Context;Lhi1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract g(Lu0;Li0;Li0;)Z
.end method

.method public abstract h(Lu0;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract i(Lu0;Lt0;Lt0;)Z
.end method

.method public abstract p(Lu0;)Li0;
.end method

.method public abstract q(Lu0;)Lt0;
.end method
