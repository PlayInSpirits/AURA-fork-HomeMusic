.class public final Ldefpackage/mc;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/qd3;


# instance fields
.field public final n:Ljava/lang/String;

.field public final o:Ldefpackage/zs4;

.field public final p:Ljava/util/List;

.field public final q:Ljava/util/List;

.field public final r:Ldefpackage/ha1;

.field public final s:Ldefpackage/oo0;

.field public final t:Ldefpackage/xc;

.field public final u:Ljava/lang/CharSequence;

.field public final v:Ldefpackage/t62;

.field public w:Ldefpackage/z05;

.field public final x:Z

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ldefpackage/zs4;Ljava/util/List;Ljava/util/List;Ldefpackage/ha1;Ldefpackage/oo0;Z)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v0, Ldefpackage/mc;->n:Ljava/lang/String;

    .line 3
    iput-object v1, v0, Ldefpackage/mc;->o:Ldefpackage/zs4;

    .line 4
    iput-object v2, v0, Ldefpackage/mc;->p:Ljava/util/List;

    move-object/from16 v4, p4

    .line 5
    iput-object v4, v0, Ldefpackage/mc;->q:Ljava/util/List;

    move-object/from16 v4, p5

    .line 6
    iput-object v4, v0, Ldefpackage/mc;->r:Ldefpackage/ha1;

    .line 7
    iput-object v3, v0, Ldefpackage/mc;->s:Ldefpackage/oo0;

    .line 8
    new-instance v4, Ldefpackage/xc;

    invoke-interface {v3}, Ldefpackage/oo0;->g()F

    move-result v5

    const/4 v6, 0x1

    .line 9
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v5, Ldefpackage/sr4;->b:Ldefpackage/sr4;

    iput-object v5, v4, Ldefpackage/xc;->b:Ldefpackage/sr4;

    const/4 v5, 0x3

    .line 12
    iput v5, v4, Ldefpackage/xc;->c:I

    .line 13
    sget-object v7, Ldefpackage/xb4;->d:Ldefpackage/xb4;

    .line 14
    iput-object v7, v4, Ldefpackage/xc;->d:Ldefpackage/xb4;

    .line 15
    iput-object v4, v0, Ldefpackage/mc;->t:Ldefpackage/xc;

    .line 16
    invoke-static {v1}, Ldefpackage/fu;->b(Ldefpackage/zs4;)Z

    move-result v7

    iget-object v8, v1, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    iget-object v1, v1, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    const/4 v9, 0x0

    if-nez v7, :cond_0

    move v7, v9

    goto :goto_1

    .line 17
    :cond_0
    sget-object v7, Ldefpackage/xz0;->a:Ldefpackage/d34;

    .line 18
    sget-object v7, Ldefpackage/xz0;->a:Ldefpackage/d34;

    .line 19
    iget-object v10, v7, Ldefpackage/d34;->o:Ljava/lang/Object;

    check-cast v10, Ldefpackage/kl4;

    if-eqz v10, :cond_1

    goto :goto_0

    .line 20
    :cond_1
    invoke-static {}, Ldefpackage/tz0;->c()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 21
    invoke-virtual {v7}, Ldefpackage/d34;->D()Ldefpackage/kl4;

    move-result-object v10

    iput-object v10, v7, Ldefpackage/d34;->o:Ljava/lang/Object;

    goto :goto_0

    .line 22
    :cond_2
    sget-object v10, Ldefpackage/fu;->t:Ldefpackage/ow1;

    .line 23
    :goto_0
    invoke-interface {v10}, Ldefpackage/kl4;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 24
    :goto_1
    iput-boolean v7, v0, Ldefpackage/mc;->x:Z

    .line 25
    iget v7, v1, Ldefpackage/sd3;->b:I

    .line 26
    iget-object v10, v8, Ldefpackage/ij4;->k:Ldefpackage/vd2;

    const/4 v11, 0x4

    const/4 v13, 0x2

    if-ne v7, v11, :cond_4

    :cond_3
    :goto_2
    move v7, v13

    goto :goto_4

    :cond_4
    const/4 v11, 0x5

    if-ne v7, v11, :cond_6

    :cond_5
    move v7, v5

    goto :goto_4

    :cond_6
    if-ne v7, v6, :cond_7

    move v7, v9

    goto :goto_4

    :cond_7
    if-ne v7, v13, :cond_8

    move v7, v6

    goto :goto_4

    :cond_8
    if-ne v7, v5, :cond_9

    goto :goto_3

    :cond_9
    if-nez v7, :cond_78

    :goto_3
    if-eqz v10, :cond_a

    .line 27
    iget-object v7, v10, Ldefpackage/vd2;->n:Ljava/util/List;

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldefpackage/ud2;

    .line 28
    iget-object v7, v7, Ldefpackage/ud2;->a:Ljava/util/Locale;

    if-nez v7, :cond_b

    .line 29
    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 30
    :cond_b
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v7

    if-eqz v7, :cond_3

    if-eq v7, v6, :cond_5

    goto :goto_2

    .line 31
    :goto_4
    iput v7, v0, Ldefpackage/mc;->y:I

    const/4 v7, -0x1

    .line 32
    iput v7, v0, Ldefpackage/mc;->z:I

    .line 33
    new-instance v10, Ldefpackage/lc;

    invoke-direct {v10, v9, v0}, Ldefpackage/lc;-><init>(ILjava/lang/Object;)V

    .line 34
    iget-object v1, v1, Ldefpackage/sd3;->i:Ldefpackage/qs4;

    if-nez v1, :cond_c

    .line 35
    sget-object v1, Ldefpackage/qs4;->c:Ldefpackage/qs4;

    .line 36
    :cond_c
    iget-boolean v11, v1, Ldefpackage/qs4;->b:Z

    if-eqz v11, :cond_d

    .line 37
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v11

    or-int/lit16 v11, v11, 0x80

    goto :goto_5

    .line 38
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v11

    and-int/lit16 v11, v11, -0x81

    .line 39
    :goto_5
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setFlags(I)V

    .line 40
    iget v1, v1, Ldefpackage/qs4;->a:I

    if-ne v1, v6, :cond_e

    .line 41
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x40

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 42
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_e
    if-ne v1, v13, :cond_f

    .line 43
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 44
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_f
    if-ne v1, v5, :cond_10

    .line 45
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 46
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    .line 47
    :cond_10
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 48
    :goto_6
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    move v5, v9

    :goto_7
    if-ge v5, v1, :cond_12

    .line 49
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 50
    move-object v14, v11

    check-cast v14, Ldefpackage/ge;

    .line 51
    iget-object v14, v14, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 52
    instance-of v14, v14, Ldefpackage/ij4;

    if-eqz v14, :cond_11

    goto :goto_8

    :cond_11
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_12
    const/4 v11, 0x0

    :goto_8
    if-eqz v11, :cond_13

    move v1, v6

    goto :goto_9

    :cond_13
    move v1, v9

    .line 53
    :goto_9
    iget-wide v14, v8, Ldefpackage/ij4;->b:J

    iget-object v2, v8, Ldefpackage/ij4;->c:Ldefpackage/gb1;

    iget-object v5, v8, Ldefpackage/ij4;->d:Ldefpackage/eb1;

    iget-object v11, v8, Ldefpackage/ij4;->g:Ljava/lang/String;

    const/16 p1, 0x0

    iget-object v12, v8, Ldefpackage/ij4;->k:Ldefpackage/vd2;

    move/from16 p4, v6

    iget-object v6, v8, Ldefpackage/ij4;->a:Ldefpackage/as4;

    iget-object v13, v8, Ldefpackage/ij4;->j:Ldefpackage/bs4;

    move-object/from16 p7, v10

    iget-wide v9, v8, Ldefpackage/ij4;->h:J

    move-object/from16 v16, v8

    .line 54
    invoke-static {v14, v15}, Ldefpackage/bt4;->b(J)J

    move-result-wide v7

    move/from16 p3, v1

    move-object/from16 v18, v2

    const-wide v1, 0x100000000L

    .line 55
    invoke-static {v7, v8, v1, v2}, Ldefpackage/ct4;->a(JJ)Z

    move-result v19

    const-wide v1, 0x200000000L

    if-eqz v19, :cond_15

    invoke-interface {v3, v14, v15}, Ldefpackage/oo0;->a0(J)F

    move-result v7

    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_14
    :goto_a
    move-object/from16 v7, v16

    goto :goto_b

    .line 56
    :cond_15
    invoke-static {v7, v8, v1, v2}, Ldefpackage/ct4;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_14

    .line 57
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v7

    invoke-static {v14, v15}, Ldefpackage/bt4;->c(J)F

    move-result v8

    mul-float/2addr v8, v7

    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_a

    .line 58
    :goto_b
    iget-object v8, v7, Ldefpackage/ij4;->f:Ldefpackage/vk0;

    if-nez v8, :cond_17

    if-nez v5, :cond_17

    if-eqz v18, :cond_16

    goto :goto_c

    :cond_16
    move-object/from16 v1, p7

    move-object/from16 v16, v6

    goto :goto_12

    :cond_17
    :goto_c
    if-nez v18, :cond_18

    .line 59
    sget-object v14, Ldefpackage/gb1;->p:Ldefpackage/gb1;

    goto :goto_d

    :cond_18
    move-object/from16 v14, v18

    :goto_d
    if-eqz v5, :cond_19

    .line 60
    iget v5, v5, Ldefpackage/eb1;->a:I

    goto :goto_e

    :cond_19
    const/4 v5, 0x0

    .line 61
    :goto_e
    iget-object v15, v7, Ldefpackage/ij4;->e:Ldefpackage/fb1;

    if-eqz v15, :cond_1a

    .line 62
    iget v15, v15, Ldefpackage/fb1;->a:I

    :goto_f
    move-object/from16 v1, p7

    goto :goto_10

    :cond_1a
    const v15, 0xffff

    goto :goto_f

    .line 63
    :goto_10
    iget-object v2, v1, Ldefpackage/lc;->o:Ljava/lang/Object;

    check-cast v2, Ldefpackage/mc;

    move-object/from16 v16, v6

    .line 64
    iget-object v6, v2, Ldefpackage/mc;->r:Ldefpackage/ha1;

    check-cast v6, Ldefpackage/ia1;

    invoke-virtual {v6, v8, v14, v5, v15}, Ldefpackage/ia1;->b(Ldefpackage/vk0;Ldefpackage/gb1;II)Ldefpackage/n05;

    move-result-object v5

    .line 65
    instance-of v6, v5, Ldefpackage/n05;

    if-nez v6, :cond_1b

    .line 66
    new-instance v6, Ldefpackage/z05;

    iget-object v8, v2, Ldefpackage/mc;->w:Ldefpackage/z05;

    invoke-direct {v6, v5, v8}, Ldefpackage/z05;-><init>(Ldefpackage/n05;Ldefpackage/z05;)V

    .line 67
    iput-object v6, v2, Ldefpackage/mc;->w:Ldefpackage/z05;

    .line 68
    iget-object v2, v6, Ldefpackage/z05;->q:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Landroid/graphics/Typeface;

    goto :goto_11

    .line 69
    :cond_1b
    iget-object v2, v5, Ldefpackage/n05;->n:Ljava/lang/Object;

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Landroid/graphics/Typeface;

    .line 71
    :goto_11
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_12
    const/16 v2, 0xa

    if-eqz v12, :cond_1d

    .line 72
    sget-object v5, Ldefpackage/vd2;->p:Ldefpackage/vd2;

    invoke-static {}, Ldefpackage/fh0;->m()Ldefpackage/vd2;

    move-result-object v5

    .line 73
    invoke-virtual {v12, v5}, Ldefpackage/vd2;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1d

    .line 74
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v12, v2}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    iget-object v6, v12, Ldefpackage/vd2;->n:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 76
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 77
    check-cast v8, Ldefpackage/ud2;

    .line 78
    iget-object v8, v8, Ldefpackage/ud2;->a:Ljava/util/Locale;

    .line 79
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1c
    const/4 v8, 0x0

    .line 80
    new-array v6, v8, [Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    .line 81
    check-cast v5, [Ljava/util/Locale;

    array-length v6, v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/util/Locale;

    new-instance v6, Landroid/os/LocaleList;

    invoke-direct {v6, v5}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 82
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    :cond_1d
    if-eqz v11, :cond_1e

    .line 83
    const-string v5, ""

    .line 84
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    .line 85
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1e
    if-eqz v13, :cond_1f

    .line 86
    sget-object v5, Ldefpackage/bs4;->c:Ldefpackage/bs4;

    .line 87
    invoke-virtual {v13, v5}, Ldefpackage/bs4;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    .line 88
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v5

    .line 89
    iget v6, v13, Ldefpackage/bs4;->a:F

    mul-float/2addr v5, v6

    .line 90
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 91
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v5

    .line 92
    iget v6, v13, Ldefpackage/bs4;->b:F

    add-float/2addr v5, v6

    .line 93
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 94
    :cond_1f
    invoke-interface/range {v16 .. v16}, Ldefpackage/as4;->c()J

    move-result-wide v5

    .line 95
    invoke-virtual {v4, v5, v6}, Ldefpackage/xc;->d(J)V

    .line 96
    invoke-interface/range {v16 .. v16}, Ldefpackage/as4;->f()Ldefpackage/uo;

    move-result-object v5

    const-wide v11, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 97
    invoke-interface/range {v16 .. v16}, Ldefpackage/as4;->b()F

    move-result v6

    .line 98
    invoke-virtual {v4, v5, v11, v12, v6}, Ldefpackage/xc;->c(Ldefpackage/uo;JF)V

    .line 99
    iget-object v5, v7, Ldefpackage/ij4;->n:Ldefpackage/xb4;

    .line 100
    invoke-virtual {v4, v5}, Ldefpackage/xc;->f(Ldefpackage/xb4;)V

    .line 101
    iget-object v5, v7, Ldefpackage/ij4;->m:Ldefpackage/sr4;

    .line 102
    invoke-virtual {v4, v5}, Ldefpackage/xc;->g(Ldefpackage/sr4;)V

    .line 103
    iget-object v5, v7, Ldefpackage/ij4;->o:Ldefpackage/q05;

    .line 104
    invoke-virtual {v4, v5}, Ldefpackage/xc;->e(Ldefpackage/q05;)V

    .line 105
    invoke-static {v9, v10}, Ldefpackage/bt4;->b(J)J

    move-result-wide v5

    const-wide v11, 0x100000000L

    invoke-static {v5, v6, v11, v12}, Ldefpackage/ct4;->a(JJ)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_22

    invoke-static {v9, v10}, Ldefpackage/bt4;->c(J)F

    move-result v5

    cmpg-float v5, v5, v6

    if-nez v5, :cond_20

    goto :goto_14

    .line 106
    :cond_20
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v8

    mul-float/2addr v8, v5

    .line 107
    invoke-interface {v3, v9, v10}, Ldefpackage/oo0;->a0(J)F

    move-result v3

    cmpg-float v5, v8, v6

    if-nez v5, :cond_21

    goto :goto_15

    :cond_21
    div-float/2addr v3, v8

    .line 108
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_15

    .line 109
    :cond_22
    :goto_14
    invoke-static {v9, v10}, Ldefpackage/bt4;->b(J)J

    move-result-wide v11

    const-wide v13, 0x200000000L

    invoke-static {v11, v12, v13, v14}, Ldefpackage/ct4;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_23

    .line 110
    invoke-static {v9, v10}, Ldefpackage/bt4;->c(J)F

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 111
    :cond_23
    :goto_15
    iget-wide v3, v7, Ldefpackage/ij4;->l:J

    .line 112
    iget-object v5, v7, Ldefpackage/ij4;->i:Ldefpackage/hr;

    if-eqz p3, :cond_25

    .line 113
    invoke-static {v9, v10}, Ldefpackage/bt4;->b(J)J

    move-result-wide v7

    const-wide v11, 0x100000000L

    invoke-static {v7, v8, v11, v12}, Ldefpackage/ct4;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_25

    invoke-static {v9, v10}, Ldefpackage/bt4;->c(J)F

    move-result v7

    cmpg-float v7, v7, v6

    if-nez v7, :cond_24

    goto :goto_16

    :cond_24
    move/from16 v7, p4

    goto :goto_17

    :cond_25
    :goto_16
    const/4 v7, 0x0

    .line 114
    :goto_17
    sget-wide v11, Ldefpackage/x40;->g:J

    .line 115
    invoke-static {v3, v4, v11, v12}, Ldefpackage/x40;->c(JJ)Z

    move-result v8

    if-nez v8, :cond_26

    .line 116
    sget-wide v13, Ldefpackage/x40;->f:J

    .line 117
    invoke-static {v3, v4, v13, v14}, Ldefpackage/x40;->c(JJ)Z

    move-result v8

    if-nez v8, :cond_26

    move/from16 v8, p4

    goto :goto_18

    :cond_26
    const/4 v8, 0x0

    :goto_18
    if-eqz v5, :cond_28

    .line 118
    iget v13, v5, Ldefpackage/hr;->a:F

    .line 119
    invoke-static {v13, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v13

    if-nez v13, :cond_27

    goto :goto_19

    :cond_27
    move/from16 v13, p4

    goto :goto_1a

    :cond_28
    :goto_19
    const/4 v13, 0x0

    :goto_1a
    if-nez v7, :cond_29

    if-nez v8, :cond_29

    if-nez v13, :cond_29

    move-object/from16 v3, p1

    goto :goto_1f

    :cond_29
    if-eqz v7, :cond_2a

    :goto_1b
    move-wide/from16 v30, v9

    goto :goto_1c

    .line 120
    :cond_2a
    sget-wide v9, Ldefpackage/bt4;->c:J

    goto :goto_1b

    :goto_1c
    if-eqz v8, :cond_2b

    move-wide/from16 v35, v3

    goto :goto_1d

    :cond_2b
    move-wide/from16 v35, v11

    :goto_1d
    if-eqz v13, :cond_2c

    move-object/from16 v32, v5

    goto :goto_1e

    :cond_2c
    move-object/from16 v32, p1

    .line 121
    :goto_1e
    new-instance v20, Ldefpackage/ij4;

    const/16 v38, 0x0

    const v39, 0xf67f

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v20 .. v39}, Ldefpackage/ij4;-><init>(JJLdefpackage/gb1;Ldefpackage/eb1;Ldefpackage/fb1;Ldefpackage/vk0;Ljava/lang/String;JLdefpackage/hr;Ldefpackage/bs4;Ldefpackage/vd2;JLdefpackage/sr4;Ldefpackage/xb4;I)V

    move-object/from16 v3, v20

    .line 122
    :goto_1f
    iget-object v4, v0, Ldefpackage/mc;->p:Ljava/util/List;

    if-eqz v3, :cond_2f

    .line 123
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    :goto_20
    if-ge v7, v4, :cond_2e

    if-nez v7, :cond_2d

    .line 124
    new-instance v8, Ldefpackage/ge;

    .line 125
    iget-object v9, v0, Ldefpackage/mc;->n:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x0

    .line 126
    invoke-direct {v8, v10, v9, v3}, Ldefpackage/ge;-><init>(IILjava/lang/Object;)V

    goto :goto_21

    .line 127
    :cond_2d
    iget-object v8, v0, Ldefpackage/mc;->p:Ljava/util/List;

    add-int/lit8 v9, v7, -0x1

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ldefpackage/ge;

    .line 128
    :goto_21
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    :cond_2e
    move-object v4, v5

    .line 129
    :cond_2f
    iget-object v3, v0, Ldefpackage/mc;->n:Ljava/lang/String;

    .line 130
    iget-object v5, v0, Ldefpackage/mc;->t:Ldefpackage/xc;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    .line 131
    iget-object v7, v0, Ldefpackage/mc;->o:Ldefpackage/zs4;

    .line 132
    iget-object v8, v0, Ldefpackage/mc;->q:Ljava/util/List;

    .line 133
    iget-object v12, v0, Ldefpackage/mc;->s:Ldefpackage/oo0;

    .line 134
    iget-boolean v9, v0, Ldefpackage/mc;->x:Z

    .line 135
    iget-object v10, v0, Ldefpackage/mc;->n:Ljava/lang/String;

    iget v11, v0, Ldefpackage/mc;->z:I

    const/4 v13, -0x1

    if-ne v11, v13, :cond_32

    .line 136
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    const/16 v13, 0x200

    if-gt v11, v13, :cond_31

    invoke-static {v10, v2}, Ldefpackage/qm4;->n0(Ljava/lang/CharSequence;C)Z

    move-result v10

    if-eqz v10, :cond_30

    goto :goto_22

    :cond_30
    const/4 v10, 0x0

    goto :goto_23

    :cond_31
    :goto_22
    move/from16 v10, p4

    .line 137
    :goto_23
    iput v10, v0, Ldefpackage/mc;->z:I

    .line 138
    :cond_32
    sget-object v10, Ldefpackage/kc;->a:Ldefpackage/jc;

    if-eqz v9, :cond_36

    .line 139
    invoke-static {}, Ldefpackage/tz0;->c()Z

    move-result v9

    if-eqz v9, :cond_36

    .line 140
    iget-object v9, v7, Ldefpackage/zs4;->c:Ldefpackage/eh3;

    if-eqz v9, :cond_33

    .line 141
    iget-object v9, v9, Ldefpackage/eh3;->a:Ldefpackage/zg3;

    if-eqz v9, :cond_33

    .line 142
    iget v9, v9, Ldefpackage/zg3;->b:I

    .line 143
    new-instance v10, Ldefpackage/h01;

    invoke-direct {v10, v9}, Ldefpackage/h01;-><init>(I)V

    goto :goto_24

    :cond_33
    move-object/from16 v10, p1

    :goto_24
    if-nez v10, :cond_35

    :cond_34
    const/4 v9, 0x0

    goto :goto_25

    .line 144
    :cond_35
    iget v9, v10, Ldefpackage/h01;->a:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_34

    move/from16 v9, p4

    .line 145
    :goto_25
    invoke-static {}, Ldefpackage/tz0;->a()Ldefpackage/tz0;

    move-result-object v10

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v13, 0x0

    invoke-virtual {v10, v13, v11, v9, v3}, Ldefpackage/tz0;->f(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_26

    :cond_36
    move-object v9, v3

    .line 146
    :goto_26
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v10

    const-wide/16 v13, 0x0

    const-wide v15, 0xff00000000L

    if-eqz v10, :cond_37

    .line 147
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_37

    .line 148
    iget-object v10, v7, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 149
    iget-object v10, v10, Ldefpackage/sd3;->d:Ldefpackage/cs4;

    .line 150
    sget-object v11, Ldefpackage/cs4;->c:Ldefpackage/cs4;

    .line 151
    invoke-static {v10, v11}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_37

    .line 152
    iget-object v10, v7, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    .line 153
    iget-wide v10, v10, Ldefpackage/sd3;->c:J

    and-long/2addr v10, v15

    cmp-long v10, v10, v13

    if-nez v10, :cond_37

    goto/16 :goto_4e

    .line 154
    :cond_37
    instance-of v10, v9, Landroid/text/Spannable;

    if-eqz v10, :cond_38

    .line 155
    check-cast v9, Landroid/text/Spannable;

    goto :goto_27

    .line 156
    :cond_38
    new-instance v10, Landroid/text/SpannableString;

    invoke-direct {v10, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v9, v10

    .line 157
    :goto_27
    iget-object v10, v7, Ldefpackage/zs4;->a:Ldefpackage/ij4;

    iget-object v11, v7, Ldefpackage/zs4;->b:Ldefpackage/sd3;

    move/from16 p2, v6

    .line 158
    iget-object v6, v10, Ldefpackage/ij4;->m:Ldefpackage/sr4;

    move-wide/from16 p6, v13

    .line 159
    sget-object v13, Ldefpackage/sr4;->c:Ldefpackage/sr4;

    invoke-static {v6, v13}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/16 v13, 0x21

    if-eqz v6, :cond_39

    .line 160
    sget-object v6, Ldefpackage/kc;->a:Ldefpackage/jc;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v14, 0x0

    .line 161
    invoke-interface {v9, v6, v14, v3, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 162
    :cond_39
    iget-object v3, v7, Ldefpackage/zs4;->c:Ldefpackage/eh3;

    if-eqz v3, :cond_3a

    .line 163
    iget-object v3, v3, Ldefpackage/eh3;->a:Ldefpackage/zg3;

    if-eqz v3, :cond_3a

    .line 164
    iget-boolean v3, v3, Ldefpackage/zg3;->a:Z

    goto :goto_28

    :cond_3a
    const/4 v3, 0x0

    :goto_28
    if-eqz v3, :cond_3c

    .line 165
    iget-object v3, v11, Ldefpackage/sd3;->f:Ldefpackage/ra2;

    if-nez v3, :cond_3c

    .line 166
    iget-wide v2, v11, Ldefpackage/sd3;->c:J

    .line 167
    invoke-static {v2, v3, v5, v12}, Ldefpackage/uo;->O(JFLdefpackage/oo0;)F

    move-result v2

    .line 168
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_3b

    .line 169
    new-instance v3, Ldefpackage/na2;

    invoke-direct {v3, v2}, Ldefpackage/na2;-><init>(F)V

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v14, 0x0

    .line 170
    invoke-interface {v9, v3, v14, v2, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_3b
    const/4 v14, 0x0

    goto/16 :goto_2e

    .line 171
    :cond_3c
    iget-object v3, v11, Ldefpackage/sd3;->f:Ldefpackage/ra2;

    if-nez v3, :cond_3d

    .line 172
    sget-object v3, Ldefpackage/ra2;->d:Ldefpackage/ra2;

    .line 173
    :cond_3d
    iget-wide v6, v11, Ldefpackage/sd3;->c:J

    .line 174
    invoke-static {v6, v7, v5, v12}, Ldefpackage/uo;->O(JFLdefpackage/oo0;)F

    move-result v21

    .line 175
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_3b

    .line 176
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_3e

    goto :goto_29

    .line 177
    :cond_3e
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-eqz v6, :cond_42

    .line 178
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    .line 179
    invoke-interface {v9, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-ne v6, v2, :cond_3f

    .line 180
    :goto_29
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    :goto_2a
    move/from16 v22, v2

    goto :goto_2b

    :cond_3f
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    goto :goto_2a

    .line 181
    :goto_2b
    new-instance v20, Ldefpackage/sa2;

    .line 182
    iget v2, v3, Ldefpackage/ra2;->b:I

    and-int/lit8 v6, v2, 0x1

    if-lez v6, :cond_40

    move/from16 v23, p4

    goto :goto_2c

    :cond_40
    const/16 v23, 0x0

    :goto_2c
    and-int/lit8 v2, v2, 0x10

    if-lez v2, :cond_41

    move/from16 v24, p4

    goto :goto_2d

    :cond_41
    const/16 v24, 0x0

    .line 183
    :goto_2d
    iget v2, v3, Ldefpackage/ra2;->a:F

    .line 184
    iget v3, v3, Ldefpackage/ra2;->c:I

    move/from16 v25, v2

    move/from16 v26, v3

    .line 185
    invoke-direct/range {v20 .. v26}, Ldefpackage/sa2;-><init>(FIZZFI)V

    move-object/from16 v2, v20

    .line 186
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v14, 0x0

    .line 187
    invoke-interface {v9, v2, v14, v3, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_2e

    .line 188
    :cond_42
    const-string v0, "Char sequence is empty."

    invoke-static {v0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    throw p1

    .line 189
    :goto_2e
    iget-object v2, v11, Ldefpackage/sd3;->d:Ldefpackage/cs4;

    if-eqz v2, :cond_44

    .line 190
    iget-wide v6, v2, Ldefpackage/cs4;->a:J

    iget-wide v2, v2, Ldefpackage/cs4;->b:J

    move/from16 p5, v14

    move-wide/from16 v20, v15

    .line 191
    invoke-static/range {p5 .. p5}, Ldefpackage/su3;->v(I)J

    move-result-wide v14

    invoke-static {v6, v7, v14, v15}, Ldefpackage/bt4;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_43

    invoke-static/range {p5 .. p5}, Ldefpackage/su3;->v(I)J

    move-result-wide v14

    invoke-static {v2, v3, v14, v15}, Ldefpackage/bt4;->a(JJ)Z

    move-result v14

    if-nez v14, :cond_44

    :cond_43
    and-long v14, v6, v20

    cmp-long v14, v14, p6

    if-nez v14, :cond_45

    :cond_44
    :goto_2f
    move-object/from16 p7, v1

    goto/16 :goto_32

    :cond_45
    and-long v14, v2, v20

    cmp-long v14, v14, p6

    if-nez v14, :cond_46

    goto :goto_2f

    .line 192
    :cond_46
    invoke-static {v6, v7}, Ldefpackage/bt4;->b(J)J

    move-result-wide v14

    move-object/from16 p7, v1

    const-wide v0, 0x100000000L

    .line 193
    invoke-static {v14, v15, v0, v1}, Ldefpackage/ct4;->a(JJ)Z

    move-result v16

    if-eqz v16, :cond_47

    invoke-interface {v12, v6, v7}, Ldefpackage/oo0;->a0(J)F

    move-result v6

    const-wide v0, 0x200000000L

    goto :goto_30

    :cond_47
    const-wide v0, 0x200000000L

    .line 194
    invoke-static {v14, v15, v0, v1}, Ldefpackage/ct4;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_48

    invoke-static {v6, v7}, Ldefpackage/bt4;->c(J)F

    move-result v6

    mul-float/2addr v6, v5

    goto :goto_30

    :cond_48
    move/from16 v6, p2

    .line 195
    :goto_30
    invoke-static {v2, v3}, Ldefpackage/bt4;->b(J)J

    move-result-wide v14

    const-wide v0, 0x100000000L

    .line 196
    invoke-static {v14, v15, v0, v1}, Ldefpackage/ct4;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_49

    invoke-interface {v12, v2, v3}, Ldefpackage/oo0;->a0(J)F

    move-result v0

    goto :goto_31

    :cond_49
    const-wide v0, 0x200000000L

    .line 197
    invoke-static {v14, v15, v0, v1}, Ldefpackage/ct4;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_4a

    invoke-static {v2, v3}, Ldefpackage/bt4;->c(J)F

    move-result v0

    mul-float/2addr v0, v5

    goto :goto_31

    :cond_4a
    move/from16 v0, p2

    .line 198
    :goto_31
    new-instance v1, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    float-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v0, v5

    float-to-int v0, v0

    invoke-direct {v1, v2, v0}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 199
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v14, 0x0

    .line 200
    invoke-interface {v9, v1, v14, v0, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 201
    :goto_32
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_33
    if-ge v2, v1, :cond_4e

    .line 203
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 204
    check-cast v3, Ldefpackage/ge;

    .line 205
    iget-object v5, v3, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 206
    instance-of v6, v5, Ldefpackage/ij4;

    if-eqz v6, :cond_4d

    move-object v6, v5

    check-cast v6, Ldefpackage/ij4;

    .line 207
    iget-object v7, v6, Ldefpackage/ij4;->f:Ldefpackage/vk0;

    if-nez v7, :cond_4c

    .line 208
    iget-object v7, v6, Ldefpackage/ij4;->d:Ldefpackage/eb1;

    if-nez v7, :cond_4c

    .line 209
    iget-object v6, v6, Ldefpackage/ij4;->c:Ldefpackage/gb1;

    if-eqz v6, :cond_4b

    goto :goto_34

    .line 210
    :cond_4b
    check-cast v5, Ldefpackage/ij4;

    .line 211
    iget-object v5, v5, Ldefpackage/ij4;->e:Ldefpackage/fb1;

    if-eqz v5, :cond_4d

    .line 212
    :cond_4c
    :goto_34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4d
    add-int/lit8 v2, v2, 0x1

    goto :goto_33

    .line 213
    :cond_4e
    iget-object v1, v10, Ldefpackage/ij4;->f:Ldefpackage/vk0;

    if-nez v1, :cond_51

    .line 214
    iget-object v2, v10, Ldefpackage/ij4;->d:Ldefpackage/eb1;

    if-nez v2, :cond_51

    .line 215
    iget-object v2, v10, Ldefpackage/ij4;->c:Ldefpackage/gb1;

    if-eqz v2, :cond_4f

    goto :goto_35

    .line 216
    :cond_4f
    iget-object v2, v10, Ldefpackage/ij4;->e:Ldefpackage/fb1;

    if-eqz v2, :cond_50

    goto :goto_35

    :cond_50
    move-object/from16 v1, p1

    goto :goto_36

    .line 217
    :cond_51
    :goto_35
    iget-object v2, v10, Ldefpackage/ij4;->c:Ldefpackage/gb1;

    .line 218
    iget-object v3, v10, Ldefpackage/ij4;->d:Ldefpackage/eb1;

    .line 219
    iget-object v5, v10, Ldefpackage/ij4;->e:Ldefpackage/fb1;

    .line 220
    new-instance v20, Ldefpackage/ij4;

    const/16 v38, 0x0

    const v39, 0xffc3

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v28, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v27, v5

    invoke-direct/range {v20 .. v39}, Ldefpackage/ij4;-><init>(JJLdefpackage/gb1;Ldefpackage/eb1;Ldefpackage/fb1;Ldefpackage/vk0;Ljava/lang/String;JLdefpackage/hr;Ldefpackage/bs4;Ldefpackage/vd2;JLdefpackage/sr4;Ldefpackage/xb4;I)V

    move-object/from16 v1, v20

    .line 221
    :goto_36
    new-instance v2, Ldefpackage/gc3;

    move/from16 v5, p4

    move-object/from16 v3, p7

    invoke-direct {v2, v5, v9, v3}, Ldefpackage/gc3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 222
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gt v3, v5, :cond_52

    .line 223
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_59

    const/4 v14, 0x0

    .line 224
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldefpackage/ge;

    .line 225
    iget-object v3, v3, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 226
    check-cast v3, Ldefpackage/ij4;

    invoke-static {v1, v3}, Ldefpackage/uo;->z(Ldefpackage/ij4;Ldefpackage/ij4;)Ldefpackage/ij4;

    move-result-object v1

    .line 227
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldefpackage/ge;

    .line 228
    iget v3, v3, Ldefpackage/ge;->b:I

    .line 229
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 230
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldefpackage/ge;

    .line 231
    iget v0, v0, Ldefpackage/ge;->c:I

    .line 232
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 233
    invoke-virtual {v2, v1, v3, v0}, Ldefpackage/gc3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3b

    .line 234
    :cond_52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    mul-int/lit8 v5, v3, 0x2

    .line 235
    new-array v6, v5, [I

    .line 236
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v10, 0x0

    :goto_37
    if-ge v10, v7, :cond_53

    .line 237
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 238
    check-cast v14, Ldefpackage/ge;

    .line 239
    iget v15, v14, Ldefpackage/ge;->b:I

    .line 240
    aput v15, v6, v10

    add-int v15, v10, v3

    .line 241
    iget v14, v14, Ldefpackage/ge;->c:I

    .line 242
    aput v14, v6, v15

    add-int/lit8 v10, v10, 0x1

    goto :goto_37

    :cond_53
    const/4 v10, 0x1

    if-le v5, v10, :cond_54

    .line 243
    invoke-static {v6}, Ljava/util/Arrays;->sort([I)V

    :cond_54
    if-eqz v5, :cond_77

    const/4 v14, 0x0

    .line 244
    aget v3, v6, v14

    move v7, v3

    const/4 v3, 0x0

    :goto_38
    if-ge v3, v5, :cond_59

    .line 245
    aget v10, v6, v3

    if-ne v10, v7, :cond_55

    move-object/from16 p6, v0

    move-object/from16 v16, v1

    move/from16 v17, v3

    goto :goto_3a

    .line 246
    :cond_55
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v14

    move-object v13, v1

    const/4 v15, 0x0

    :goto_39
    if-ge v15, v14, :cond_57

    .line 247
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p6, v0

    .line 248
    move-object/from16 v0, v16

    check-cast v0, Ldefpackage/ge;

    move-object/from16 v16, v1

    .line 249
    iget v1, v0, Ldefpackage/ge;->b:I

    move/from16 v17, v3

    .line 250
    iget v3, v0, Ldefpackage/ge;->c:I

    if-eq v1, v3, :cond_56

    .line 251
    invoke-static {v7, v10, v1, v3}, Ldefpackage/ie;->a(IIII)Z

    move-result v1

    if-eqz v1, :cond_56

    .line 252
    iget-object v0, v0, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 253
    check-cast v0, Ldefpackage/ij4;

    invoke-static {v13, v0}, Ldefpackage/uo;->z(Ldefpackage/ij4;Ldefpackage/ij4;)Ldefpackage/ij4;

    move-result-object v13

    :cond_56
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p6

    move-object/from16 v1, v16

    move/from16 v3, v17

    goto :goto_39

    :cond_57
    move-object/from16 p6, v0

    move-object/from16 v16, v1

    move/from16 v17, v3

    if-eqz v13, :cond_58

    .line 254
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v13, v0, v1}, Ldefpackage/gc3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_58
    move v7, v10

    :goto_3a
    add-int/lit8 v3, v17, 0x1

    move-object/from16 v0, p6

    move-object/from16 v1, v16

    const/16 v13, 0x21

    goto :goto_38

    .line 255
    :cond_59
    :goto_3b
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3c
    if-ge v1, v0, :cond_6a

    .line 256
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldefpackage/ge;

    .line 257
    iget-object v5, v3, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 258
    instance-of v6, v5, Ldefpackage/ij4;

    if-eqz v6, :cond_5a

    .line 259
    iget v13, v3, Ldefpackage/ge;->b:I

    .line 260
    iget v14, v3, Ldefpackage/ge;->c:I

    if-ltz v13, :cond_5a

    .line 261
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v13, v3, :cond_5a

    if-le v14, v13, :cond_5a

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v14, v3, :cond_5b

    :cond_5a
    move/from16 p6, v0

    move/from16 v22, v1

    move/from16 p7, v2

    goto/16 :goto_46

    .line 262
    :cond_5b
    check-cast v5, Ldefpackage/ij4;

    iget-wide v6, v5, Ldefpackage/ij4;->h:J

    .line 263
    iget-object v3, v5, Ldefpackage/ij4;->i:Ldefpackage/hr;

    iget-object v10, v5, Ldefpackage/ij4;->a:Ldefpackage/as4;

    if-eqz v3, :cond_5c

    .line 264
    iget v3, v3, Ldefpackage/hr;->a:F

    .line 265
    new-instance v15, Ldefpackage/ir;

    move/from16 p6, v0

    const/4 v0, 0x0

    invoke-direct {v15, v0, v3}, Ldefpackage/ir;-><init>(IF)V

    const/16 v0, 0x21

    .line 266
    invoke-interface {v9, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_3d
    move v3, v1

    goto :goto_3e

    :cond_5c
    move/from16 p6, v0

    goto :goto_3d

    .line 267
    :goto_3e
    invoke-interface {v10}, Ldefpackage/as4;->c()J

    move-result-wide v0

    .line 268
    invoke-static {v9, v0, v1, v13, v14}, Ldefpackage/uo;->P(Landroid/text/Spannable;JII)V

    .line 269
    invoke-interface {v10}, Ldefpackage/as4;->f()Ldefpackage/uo;

    move-result-object v0

    .line 270
    invoke-interface {v10}, Ldefpackage/as4;->b()F

    move-result v1

    if-eqz v0, :cond_5e

    .line 271
    instance-of v10, v0, Ldefpackage/zh4;

    if-eqz v10, :cond_5d

    .line 272
    check-cast v0, Ldefpackage/zh4;

    .line 273
    iget-wide v0, v0, Ldefpackage/zh4;->u:J

    .line 274
    invoke-static {v9, v0, v1, v13, v14}, Ldefpackage/uo;->P(Landroid/text/Spannable;JII)V

    goto :goto_3f

    .line 275
    :cond_5d
    new-instance v10, Ldefpackage/wb4;

    check-cast v0, Ldefpackage/pv;

    invoke-direct {v10, v0, v1}, Ldefpackage/wb4;-><init>(Ldefpackage/pv;F)V

    const/16 v0, 0x21

    .line 276
    invoke-interface {v9, v10, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 277
    :cond_5e
    :goto_3f
    iget-object v0, v5, Ldefpackage/ij4;->m:Ldefpackage/sr4;

    if-eqz v0, :cond_61

    .line 278
    iget v0, v0, Ldefpackage/sr4;->a:I

    .line 279
    new-instance v1, Ldefpackage/tr4;

    or-int/lit8 v10, v0, 0x1

    if-ne v10, v0, :cond_5f

    const/4 v10, 0x1

    goto :goto_40

    :cond_5f
    const/4 v10, 0x0

    :goto_40
    or-int/lit8 v15, v0, 0x2

    if-ne v15, v0, :cond_60

    const/4 v0, 0x1

    goto :goto_41

    :cond_60
    const/4 v0, 0x0

    :goto_41
    invoke-direct {v1, v10, v0}, Ldefpackage/tr4;-><init>(ZZ)V

    const/16 v0, 0x21

    .line 280
    invoke-interface {v9, v1, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_42
    move-object v1, v11

    goto :goto_43

    :cond_61
    const/16 v0, 0x21

    goto :goto_42

    .line 281
    :goto_43
    iget-wide v10, v5, Ldefpackage/ij4;->b:J

    .line 282
    invoke-static/range {v9 .. v14}, Ldefpackage/uo;->Q(Landroid/text/Spannable;JLdefpackage/oo0;II)V

    .line 283
    iget-object v10, v5, Ldefpackage/ij4;->g:Ljava/lang/String;

    if-eqz v10, :cond_62

    .line 284
    new-instance v11, Ldefpackage/ka1;

    const/4 v15, 0x0

    invoke-direct {v11, v15, v10}, Ldefpackage/ka1;-><init>(ILjava/lang/Object;)V

    .line 285
    invoke-interface {v9, v11, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 286
    :cond_62
    iget-object v10, v5, Ldefpackage/ij4;->j:Ldefpackage/bs4;

    if-eqz v10, :cond_63

    .line 287
    new-instance v11, Landroid/text/style/ScaleXSpan;

    .line 288
    iget v15, v10, Ldefpackage/bs4;->a:F

    .line 289
    invoke-direct {v11, v15}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 290
    invoke-interface {v9, v11, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 291
    new-instance v11, Ldefpackage/ir;

    .line 292
    iget v10, v10, Ldefpackage/bs4;->b:F

    const/4 v15, 0x1

    .line 293
    invoke-direct {v11, v15, v10}, Ldefpackage/ir;-><init>(IF)V

    .line 294
    invoke-interface {v9, v11, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_44

    :cond_63
    const/4 v15, 0x1

    .line 295
    :goto_44
    iget-object v10, v5, Ldefpackage/ij4;->k:Ldefpackage/vd2;

    .line 296
    invoke-static {v9, v10, v13, v14}, Ldefpackage/uo;->R(Landroid/text/Spannable;Ldefpackage/vd2;II)V

    .line 297
    iget-wide v10, v5, Ldefpackage/ij4;->l:J

    const-wide/16 v16, 0x10

    cmp-long v16, v10, v16

    if-eqz v16, :cond_64

    .line 298
    new-instance v15, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v10, v11}, Ldefpackage/e35;->U(J)I

    move-result v10

    invoke-direct {v15, v10}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 299
    invoke-interface {v9, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 300
    :cond_64
    iget-object v10, v5, Ldefpackage/ij4;->n:Ldefpackage/xb4;

    if-eqz v10, :cond_66

    move-object v11, v1

    .line 301
    iget-wide v0, v10, Ldefpackage/xb4;->b:J

    .line 302
    new-instance v15, Ldefpackage/zb4;

    move-wide/from16 v16, v0

    .line 303
    iget-wide v0, v10, Ldefpackage/xb4;->a:J

    .line 304
    invoke-static {v0, v1}, Ldefpackage/e35;->U(J)I

    move-result v0

    const/16 v1, 0x20

    move/from16 p7, v2

    shr-long v1, v16, v1

    long-to-int v1, v1

    .line 305
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v20, 0xffffffffL

    move/from16 v22, v3

    and-long v2, v16, v20

    long-to-int v2, v2

    .line 306
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 307
    iget v3, v10, Ldefpackage/xb4;->c:F

    cmpg-float v10, v3, p2

    if-nez v10, :cond_65

    const/4 v3, 0x1

    .line 308
    :cond_65
    invoke-direct {v15, v0, v1, v2, v3}, Ldefpackage/zb4;-><init>(IFFF)V

    const/16 v0, 0x21

    .line 309
    invoke-interface {v9, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_45

    :cond_66
    move-object v11, v1

    move/from16 p7, v2

    move/from16 v22, v3

    .line 310
    :goto_45
    iget-object v1, v5, Ldefpackage/ij4;->o:Ldefpackage/q05;

    if-eqz v1, :cond_67

    .line 311
    new-instance v2, Ldefpackage/tv0;

    invoke-direct {v2, v1}, Ldefpackage/tv0;-><init>(Ldefpackage/q05;)V

    .line 312
    invoke-interface {v9, v2, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 313
    :cond_67
    invoke-static {v6, v7}, Ldefpackage/bt4;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Ldefpackage/ct4;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_68

    invoke-static {v6, v7}, Ldefpackage/bt4;->b(J)J

    move-result-wide v0

    const-wide v13, 0x200000000L

    invoke-static {v0, v1, v13, v14}, Ldefpackage/ct4;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_69

    :cond_68
    const/4 v2, 0x1

    goto :goto_47

    :cond_69
    :goto_46
    move/from16 v2, p7

    :goto_47
    add-int/lit8 v1, v22, 0x1

    move/from16 v0, p6

    goto/16 :goto_3c

    :cond_6a
    move/from16 p7, v2

    if-eqz p7, :cond_70

    .line 314
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_48
    if-ge v1, v0, :cond_70

    .line 315
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldefpackage/ge;

    .line 316
    iget-object v3, v2, Ldefpackage/ge;->a:Ljava/lang/Object;

    .line 317
    check-cast v3, Ldefpackage/fe;

    .line 318
    instance-of v5, v3, Ldefpackage/ij4;

    if-eqz v5, :cond_6b

    .line 319
    iget v5, v2, Ldefpackage/ge;->b:I

    .line 320
    iget v2, v2, Ldefpackage/ge;->c:I

    if-ltz v5, :cond_6b

    .line 321
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v5, v6, :cond_6b

    if-le v2, v5, :cond_6b

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-le v2, v6, :cond_6c

    :cond_6b
    move/from16 p2, v0

    move v3, v1

    const/16 v1, 0x21

    goto :goto_4a

    .line 322
    :cond_6c
    check-cast v3, Ldefpackage/ij4;

    .line 323
    iget-wide v6, v3, Ldefpackage/ij4;->h:J

    .line 324
    invoke-static {v6, v7}, Ldefpackage/bt4;->b(J)J

    move-result-wide v13

    move/from16 p2, v0

    move v3, v1

    const-wide v0, 0x100000000L

    .line 325
    invoke-static {v13, v14, v0, v1}, Ldefpackage/ct4;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_6d

    new-instance v0, Ldefpackage/i92;

    invoke-interface {v12, v6, v7}, Ldefpackage/oo0;->a0(J)F

    move-result v1

    invoke-direct {v0, v1}, Ldefpackage/i92;-><init>(F)V

    goto :goto_49

    :cond_6d
    const-wide v0, 0x200000000L

    .line 326
    invoke-static {v13, v14, v0, v1}, Ldefpackage/ct4;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_6e

    .line 327
    new-instance v0, Ldefpackage/h92;

    invoke-static {v6, v7}, Ldefpackage/bt4;->c(J)F

    move-result v1

    invoke-direct {v0, v1}, Ldefpackage/h92;-><init>(F)V

    goto :goto_49

    :cond_6e
    move-object/from16 v0, p1

    :goto_49
    const/16 v1, 0x21

    if-eqz v0, :cond_6f

    .line 328
    invoke-interface {v9, v0, v5, v2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_6f
    :goto_4a
    add-int/lit8 v0, v3, 0x1

    move v1, v0

    move/from16 v0, p2

    goto :goto_48

    :cond_70
    move-object v1, v11

    .line 329
    iget-object v0, v1, Ldefpackage/sd3;->d:Ldefpackage/cs4;

    if-eqz v0, :cond_72

    .line 330
    iget-wide v0, v0, Ldefpackage/cs4;->a:J

    .line 331
    invoke-static {v0, v1}, Ldefpackage/bt4;->b(J)J

    move-result-wide v2

    const-wide v5, 0x100000000L

    .line 332
    invoke-static {v2, v3, v5, v6}, Ldefpackage/ct4;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_71

    invoke-interface {v12, v0, v1}, Ldefpackage/oo0;->a0(J)F

    goto :goto_4b

    :cond_71
    const-wide v13, 0x200000000L

    .line 333
    invoke-static {v2, v3, v13, v14}, Ldefpackage/ct4;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_72

    invoke-static {v0, v1}, Ldefpackage/bt4;->c(J)F

    .line 334
    :cond_72
    :goto_4b
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_4c
    if-ge v1, v0, :cond_73

    .line 335
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 336
    check-cast v2, Ldefpackage/ge;

    .line 337
    iget-object v2, v2, Ldefpackage/ge;->a:Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4c

    .line 338
    :cond_73
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_76

    const/4 v14, 0x0

    .line 339
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 340
    check-cast v0, Ldefpackage/ge;

    .line 341
    iget-object v1, v0, Ldefpackage/ge;->a:Ljava/lang/Object;

    if-nez v1, :cond_75

    .line 342
    iget v1, v0, Ldefpackage/ge;->b:I

    .line 343
    iget v0, v0, Ldefpackage/ge;->c:I

    .line 344
    const-class v2, Ldefpackage/l05;

    invoke-interface {v9, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 345
    array-length v1, v0

    :goto_4d
    if-ge v14, v1, :cond_74

    aget-object v2, v0, v14

    check-cast v2, Ldefpackage/l05;

    .line 346
    invoke-interface {v9, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_4d

    .line 347
    :cond_74
    new-instance v0, Ldefpackage/ng3;

    .line 348
    throw p1

    .line 349
    :cond_75
    invoke-static {}, Ldefpackage/kf2;->k()V

    throw p1

    :cond_76
    move-object/from16 v0, p0

    .line 350
    :goto_4e
    iput-object v9, v0, Ldefpackage/mc;->u:Ljava/lang/CharSequence;

    .line 351
    new-instance v1, Ldefpackage/t62;

    iget-object v2, v0, Ldefpackage/mc;->t:Ldefpackage/xc;

    iget v3, v0, Ldefpackage/mc;->y:I

    invoke-direct {v1, v9, v2, v3}, Ldefpackage/t62;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v1, v0, Ldefpackage/mc;->v:Ldefpackage/t62;

    return-void

    .line 352
    :cond_77
    const-string v0, "Array is empty."

    invoke-static {v0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    throw p1

    :cond_78
    const/16 p1, 0x0

    .line 353
    const-string v0, "Invalid TextDirection."

    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/mc;->w:Ldefpackage/z05;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/z05;->j()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, Ldefpackage/mc;->x:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/mc;->o:Ldefpackage/zs4;

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/fu;->b(Ldefpackage/zs4;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    sget-object p0, Ldefpackage/xz0;->a:Ldefpackage/d34;

    .line 27
    .line 28
    sget-object p0, Ldefpackage/xz0;->a:Ldefpackage/d34;

    .line 29
    .line 30
    iget-object v0, p0, Ldefpackage/d34;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ldefpackage/kl4;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {}, Ldefpackage/tz0;->c()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Ldefpackage/d34;->D()Ldefpackage/kl4;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Ldefpackage/d34;->o:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    sget-object v0, Ldefpackage/fu;->t:Ldefpackage/ow1;

    .line 51
    .line 52
    :goto_1
    invoke-interface {v0}, Ldefpackage/kl4;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    return v1

    .line 66
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final b()F
    .locals 10

    .line 1
    iget-object p0, p0, Ldefpackage/mc;->v:Ldefpackage/t62;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/t62;->e:F

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/t62;->b:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Ldefpackage/t62;->e:F

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v2, Ldefpackage/v10;

    .line 25
    .line 26
    iget-object v3, p0, Ldefpackage/t62;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {v2, v3, v4}, Ldefpackage/v10;-><init>(Ljava/lang/CharSequence;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/PriorityQueue;

    .line 39
    .line 40
    sget-object v3, Ldefpackage/g12;->d:Ldefpackage/n7;

    .line 41
    .line 42
    const/16 v4, 0xa

    .line 43
    .line 44
    invoke-direct {v2, v4, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v5, 0x0

    .line 52
    :goto_0
    const/4 v6, -0x1

    .line 53
    if-eq v3, v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->size()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/4 v7, 0x1

    .line 60
    if-ge v6, v4, :cond_1

    .line 61
    .line 62
    new-instance v6, Ldefpackage/j02;

    .line 63
    .line 64
    invoke-direct {v6, v5, v3, v7}, Ldefpackage/h02;-><init>(III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Ldefpackage/j02;

    .line 76
    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    iget v8, v6, Ldefpackage/h02;->o:I

    .line 80
    .line 81
    iget v6, v6, Ldefpackage/h02;->n:I

    .line 82
    .line 83
    sub-int/2addr v8, v6

    .line 84
    sub-int v6, v3, v5

    .line 85
    .line 86
    if-ge v8, v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    new-instance v6, Ldefpackage/j02;

    .line 92
    .line 93
    invoke-direct {v6, v5, v3, v7}, Ldefpackage/h02;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    move v9, v5

    .line 104
    move v5, v3

    .line 105
    move v3, v9

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    const/4 v3, 0x0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Ldefpackage/j02;

    .line 130
    .line 131
    iget v3, v2, Ldefpackage/h02;->n:I

    .line 132
    .line 133
    iget v2, v2, Ldefpackage/h02;->o:I

    .line 134
    .line 135
    invoke-virtual {p0}, Ldefpackage/t62;->b()Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4, v3, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    move v3, v2

    .line 144
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Ldefpackage/j02;

    .line 155
    .line 156
    iget v4, v2, Ldefpackage/h02;->n:I

    .line 157
    .line 158
    iget v2, v2, Ldefpackage/h02;->o:I

    .line 159
    .line 160
    invoke-virtual {p0}, Ldefpackage/t62;->b()Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v5, v4, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    goto :goto_2

    .line 173
    :cond_5
    :goto_3
    iput v3, p0, Ldefpackage/t62;->e:F

    .line 174
    .line 175
    return v3

    .line 176
    :cond_6
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 177
    .line 178
    .line 179
    return v3
.end method

.method public final d()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/mc;->v:Ldefpackage/t62;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/t62;->c()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
