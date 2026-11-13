.class public final Ldefpackage/ss0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/xx;
.implements Ldefpackage/j45;


# static fields
.field public static final r:[Ljava/lang/String;


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    const-string v1, "metadata"

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ldefpackage/ss0;->r:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

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
    new-instance p1, Ldefpackage/jo3;

    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ldefpackage/jo3;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance p1, Ldefpackage/yd4;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-direct {p1, v0}, Ldefpackage/yd4;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance p1, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 48
    .line 49
    new-instance p1, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 55
    .line 56
    new-instance p1, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 66
    iput-object p1, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    iput-object p4, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ldefpackage/c81;)V
    .locals 1

    .line 83
    new-instance v0, Ldefpackage/oz4;

    invoke-direct {v0, p1}, Ldefpackage/oz4;-><init>(Ljava/lang/Object;)V

    .line 84
    invoke-direct {p0, v0}, Ldefpackage/ss0;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ldefpackage/gy3;Ldefpackage/xc5;Ldefpackage/hd5;Ldefpackage/wo0;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 68
    invoke-static {p1}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 69
    sget-object p1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 70
    :goto_0
    iput-object p1, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 71
    iput-object p2, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 72
    iput-object p3, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 73
    iput-object p4, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 65
    iput-object p1, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 78
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    const/4 p0, 0x0

    if-eqz p1, :cond_1

    .line 79
    const-string v1, "id"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 80
    const-string p0, "name"

    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 81
    :cond_0
    const-string p1, "name must not be null"

    invoke-static {p1}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    throw p0

    .line 82
    :cond_1
    const-string p1, "id must not be null"

    invoke-static {p1}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    throw p0
.end method

.method public static C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldefpackage/ss0;
    .locals 3

    .line 1
    const v0, 0x7f0d00ab

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const p1, 0x7f0a00a5

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/widget/ImageView;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const p1, 0x7f0a00b4

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroid/widget/TextView;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const p1, 0x7f0a00ef

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    new-instance p1, Ldefpackage/ss0;

    .line 43
    .line 44
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 45
    .line 46
    invoke-direct {p1, p0, v0, v1, v2}, Ldefpackage/ss0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "Missing required view with ID: "

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method


# virtual methods
.method public A(Ldefpackage/ol1;)D
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/ss0;->B()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ldefpackage/ss0;->z()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ldefpackage/ss0;->z()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    check-cast v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ldefpackage/ol1;

    .line 28
    .line 29
    check-cast v0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Double;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    invoke-virtual {p0}, Ldefpackage/ss0;->B()Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p0}, Ldefpackage/ss0;->z()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ldefpackage/ol1;

    .line 57
    .line 58
    check-cast v2, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Double;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    sub-double/2addr v0, v2

    .line 71
    invoke-virtual {p0}, Ldefpackage/ss0;->B()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/Double;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    invoke-virtual {p0}, Ldefpackage/ss0;->B()Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0}, Ldefpackage/ss0;->z()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Ldefpackage/ol1;

    .line 102
    .line 103
    check-cast p1, Ljava/util/HashMap;

    .line 104
    .line 105
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Ljava/lang/Double;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 112
    .line 113
    .line 114
    move-result-wide p0

    .line 115
    sub-double/2addr v2, p0

    .line 116
    const-wide/16 p0, 0x0

    .line 117
    .line 118
    cmpl-double p0, v0, p0

    .line 119
    .line 120
    if-nez p0, :cond_0

    .line 121
    .line 122
    const-wide/high16 p0, 0x3fe0000000000000L    # 0.5

    .line 123
    .line 124
    return-wide p0

    .line 125
    :cond_0
    div-double/2addr v2, v0

    .line 126
    return-wide v2
.end method

.method public B()Ljava/util/Map;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashMap;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ldefpackage/ss0;->y()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ldefpackage/ol1;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    new-instance v2, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x0

    .line 36
    :goto_0
    if-ge v4, v3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    check-cast v5, Ldefpackage/ol1;

    .line 45
    .line 46
    iget v6, v5, Ldefpackage/ol1;->d:I

    .line 47
    .line 48
    invoke-static {v6}, Ldefpackage/h12;->C(I)[D

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    const/4 v7, 0x2

    .line 53
    aget-wide v8, v6, v7

    .line 54
    .line 55
    const/4 v10, 0x1

    .line 56
    aget-wide v11, v6, v10

    .line 57
    .line 58
    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    .line 59
    .line 60
    .line 61
    move-result-wide v8

    .line 62
    invoke-static {v8, v9}, Ljava/lang/Math;->toDegrees(D)D

    .line 63
    .line 64
    .line 65
    move-result-wide v8

    .line 66
    const-wide v11, 0x4076800000000000L    # 360.0

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    rem-double/2addr v8, v11

    .line 72
    const-wide/16 v13, 0x0

    .line 73
    .line 74
    cmpg-double v15, v8, v13

    .line 75
    .line 76
    if-gez v15, :cond_1

    .line 77
    .line 78
    add-double/2addr v8, v11

    .line 79
    :cond_1
    move v15, v7

    .line 80
    move-wide/from16 v16, v8

    .line 81
    .line 82
    aget-wide v7, v6, v10

    .line 83
    .line 84
    aget-wide v9, v6, v15

    .line 85
    .line 86
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->hypot(DD)D

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    const-wide v8, 0x3ff11eb851eb851fL    # 1.07

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 96
    .line 97
    .line 98
    move-result-wide v6

    .line 99
    const-wide v8, 0x3f947ae147ae147bL    # 0.02

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    mul-double/2addr v6, v8

    .line 105
    const-wide/high16 v8, 0x4049000000000000L    # 50.0

    .line 106
    .line 107
    sub-double v16, v16, v8

    .line 108
    .line 109
    rem-double v16, v16, v11

    .line 110
    .line 111
    cmpg-double v8, v16, v13

    .line 112
    .line 113
    if-gez v8, :cond_2

    .line 114
    .line 115
    add-double v16, v16, v11

    .line 116
    .line 117
    :cond_2
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->toRadians(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v8

    .line 121
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 122
    .line 123
    .line 124
    move-result-wide v8

    .line 125
    mul-double/2addr v8, v6

    .line 126
    const-wide/high16 v6, -0x4020000000000000L    # -0.5

    .line 127
    .line 128
    add-double/2addr v8, v6

    .line 129
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    iput-object v2, v0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 138
    .line 139
    return-object v2
.end method

.method public D(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {p1, v1, v0, v1}, Ldefpackage/r45;->b(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string v1, "DROP TABLE IF EXISTS "

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "CREATE TABLE "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)"

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public E(Ldefpackage/fe1;)V
    .locals 2

    .line 1
    iget-object v0, p1, Ldefpackage/fe1;->c:Ldefpackage/kc1;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/kc1;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, v0, Ldefpackage/kc1;->r:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    invoke-static {p0}, Ldefpackage/ld1;->I(I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    new-instance p0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p1, "Added fragment to active set "

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string p1, "FragmentManager"

    .line 43
    .line 44
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public F(Ldefpackage/fe1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    iget-object v1, p1, Ldefpackage/fe1;->c:Ldefpackage/kc1;

    .line 6
    .line 7
    iget-boolean v2, v1, Ldefpackage/kc1;->O:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/od1;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ldefpackage/od1;->f(Ldefpackage/kc1;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, v1, Ldefpackage/kc1;->r:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eq p0, p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p0, v1, Ldefpackage/kc1;->r:Ljava/lang/String;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ldefpackage/fe1;

    .line 35
    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p0, 0x2

    .line 40
    invoke-static {p0}, Ldefpackage/ld1;->I(I)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    new-instance p0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string p1, "Removed fragment from active set "

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string p1, "FragmentManager"

    .line 61
    .line 62
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_0
    return-void
.end method

.method public G(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/HashMap;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/os/Bundle;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/os/Bundle;

    .line 19
    .line 20
    return-object p0
.end method

.method public H()V
    .locals 11

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/h45;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldefpackage/rm2;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 12
    .line 13
    const v2, 0x1020048

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v2}, Ldefpackage/j65;->l(Landroid/view/View;I)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {p0, v3}, Ldefpackage/j65;->i(Landroid/view/View;I)V

    .line 21
    .line 22
    .line 23
    const v4, 0x1020049

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v4}, Ldefpackage/j65;->l(Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v3}, Ldefpackage/j65;->i(Landroid/view/View;I)V

    .line 30
    .line 31
    .line 32
    const v5, 0x1020046

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v5}, Ldefpackage/j65;->l(Landroid/view/View;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v3}, Ldefpackage/j65;->i(Landroid/view/View;I)V

    .line 39
    .line 40
    .line 41
    const v6, 0x1020047

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v6}, Ldefpackage/j65;->l(Landroid/view/View;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v3}, Ldefpackage/j65;->i(Landroid/view/View;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldefpackage/dw3;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-nez v7, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldefpackage/dw3;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v7}, Ldefpackage/dw3;->a()I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    iget-boolean v8, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 69
    .line 70
    if-nez v8, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    const/4 v9, 0x1

    .line 78
    const/4 v10, 0x0

    .line 79
    if-nez v8, :cond_7

    .line 80
    .line 81
    iget-object v5, p0, Landroidx/viewpager2/widget/ViewPager2;->t:Ldefpackage/l75;

    .line 82
    .line 83
    iget-object v5, v5, Ldefpackage/mw3;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-ne v5, v9, :cond_3

    .line 90
    .line 91
    move v3, v9

    .line 92
    :cond_3
    if-eqz v3, :cond_4

    .line 93
    .line 94
    move v5, v2

    .line 95
    goto :goto_0

    .line 96
    :cond_4
    move v5, v4

    .line 97
    :goto_0
    if-eqz v3, :cond_5

    .line 98
    .line 99
    move v2, v4

    .line 100
    :cond_5
    iget v3, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 101
    .line 102
    sub-int/2addr v7, v9

    .line 103
    if-ge v3, v7, :cond_6

    .line 104
    .line 105
    new-instance v3, Ldefpackage/o3;

    .line 106
    .line 107
    invoke-direct {v3, v5, v10}, Ldefpackage/o3;-><init>(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p0, v3, v1}, Ldefpackage/j65;->m(Landroid/view/View;Ldefpackage/o3;Ldefpackage/f4;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    iget v1, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 114
    .line 115
    if-lez v1, :cond_9

    .line 116
    .line 117
    new-instance v1, Ldefpackage/o3;

    .line 118
    .line 119
    invoke-direct {v1, v2, v10}, Ldefpackage/o3;-><init>(ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p0, v1, v0}, Ldefpackage/j65;->m(Landroid/view/View;Ldefpackage/o3;Ldefpackage/f4;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_7
    iget v2, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 127
    .line 128
    sub-int/2addr v7, v9

    .line 129
    if-ge v2, v7, :cond_8

    .line 130
    .line 131
    new-instance v2, Ldefpackage/o3;

    .line 132
    .line 133
    invoke-direct {v2, v6, v10}, Ldefpackage/o3;-><init>(ILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p0, v2, v1}, Ldefpackage/j65;->m(Landroid/view/View;Ldefpackage/o3;Ldefpackage/f4;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    iget v1, p0, Landroidx/viewpager2/widget/ViewPager2;->q:I

    .line 140
    .line 141
    if-lez v1, :cond_9

    .line 142
    .line 143
    new-instance v1, Ldefpackage/o3;

    .line 144
    .line 145
    invoke-direct {v1, v5, v10}, Ldefpackage/o3;-><init>(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p0, v1, v0}, Ldefpackage/j65;->m(Landroid/view/View;Ldefpackage/o3;Ldefpackage/f4;)V

    .line 149
    .line 150
    .line 151
    :cond_9
    :goto_1
    return-void
.end method

.method public b(Ljava/util/HashMap;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tk4;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :try_start_1
    invoke-virtual {p0, v0}, Ldefpackage/ss0;->D(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ldefpackage/wx;

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ldefpackage/ss0;->q(Landroid/database/sqlite/SQLiteDatabase;Ldefpackage/wx;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :goto_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 56
    .line 57
    .line 58
    throw p0
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 59
    :catch_0
    move-exception p0

    .line 60
    new-instance p1, Landroidx/media3/database/DatabaseIOException;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public c(Ldefpackage/wx;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/util/SparseArray;

    .line 4
    .line 5
    iget p1, p1, Ldefpackage/wx;->a:I

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->delete(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 p2, 0x0

    .line 14
    invoke-virtual {p0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public d(JLdefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;
    .locals 14

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ce;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p5 .. p5}, Ldefpackage/ce;->c()Ldefpackage/ce;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ldefpackage/ce;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "velocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Ldefpackage/ce;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ldefpackage/ce;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Ldefpackage/de;

    .line 38
    .line 39
    invoke-interface {v5, v3}, Ldefpackage/de;->get(I)Ldefpackage/c81;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Ldefpackage/ce;->a(I)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    move-object/from16 v12, p4

    .line 50
    .line 51
    invoke-virtual {v12, v3}, Ldefpackage/ce;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    invoke-virtual {v13, v3}, Ldefpackage/ce;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    move-wide v7, p1

    .line 62
    invoke-interface/range {v6 .. v11}, Ldefpackage/c81;->b(JFFF)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v4, v3, v6}, Ldefpackage/ce;->d(IF)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public e(Ldefpackage/wx;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/util/SparseArray;

    .line 4
    .line 5
    iget v0, p1, Ldefpackage/wx;->a:I

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f()Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tk4;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object p0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1, p0}, Ldefpackage/r45;->a(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    const/4 v0, -0x1

    .line 22
    if-eq p0, v0, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    new-instance v0, Landroidx/media3/database/DatabaseIOException;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public g(Ljava/util/HashMap;)V
    .locals 5

    .line 1
    iget-object p1, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/util/SparseArray;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ldefpackage/tk4;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ge v1, v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ldefpackage/wx;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v3, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const-string v4, "id = ?"

    .line 50
    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    filled-new-array {v2}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    invoke-virtual {p0, v0, v2}, Ldefpackage/ss0;->q(Landroid/database/sqlite/SQLiteDatabase;Ldefpackage/wx;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :goto_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 82
    .line 83
    .line 84
    throw p0
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 85
    :catch_0
    move-exception p0

    .line 86
    new-instance p1, Landroidx/media3/database/DatabaseIOException;

    .line 87
    .line 88
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

.method public h(J)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    const-string p2, "ExoPlayerCacheIndex"

    .line 8
    .line 9
    invoke-static {p2, p1}, Ldefpackage/xa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public i(Ljava/util/HashMap;Landroid/util/SparseArray;)V
    .locals 12

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tk4;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    move v1, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v2

    .line 20
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v4, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3, v4}, Ldefpackage/r45;->a(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eq v1, v3, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    :try_start_1
    invoke-virtual {p0, v1}, Ldefpackage/ss0;->D(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    .line 53
    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception v0

    .line 58
    move-object p0, v0

    .line 59
    goto :goto_5

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    move-object p0, v0

    .line 62
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_1
    :goto_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v5, p0

    .line 73
    check-cast v5, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v6, Ldefpackage/ss0;->r:[Ljava/lang/String;

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    invoke-virtual/range {v4 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 86
    .line 87
    .line 88
    move-result-object p0
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 89
    :goto_2
    :try_start_3
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    invoke-interface {p0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const/4 v4, 0x2

    .line 107
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    new-instance v5, Ljava/io/ByteArrayInputStream;

    .line 112
    .line 113
    invoke-direct {v5, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 114
    .line 115
    .line 116
    new-instance v4, Ljava/io/DataInputStream;

    .line 117
    .line 118
    invoke-direct {v4, v5}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v4}, Ldefpackage/ml3;->f(Ljava/io/DataInputStream;)Ldefpackage/yj0;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    new-instance v5, Ldefpackage/wx;

    .line 126
    .line 127
    invoke-direct {v5, v0, v1, v4}, Ldefpackage/wx;-><init>(ILjava/lang/String;Ldefpackage/yj0;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :catchall_1
    move-exception v0

    .line 138
    move-object v1, v0

    .line 139
    goto :goto_3

    .line 140
    :cond_2
    :try_start_4
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :goto_3
    if-eqz p0, :cond_3

    .line 145
    .line 146
    :try_start_5
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :catchall_2
    move-exception v0

    .line 151
    move-object p0, v0

    .line 152
    :try_start_6
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    :goto_4
    throw v1
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0

    .line 156
    :goto_5
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 160
    .line 161
    .line 162
    new-instance p1, Landroidx/media3/database/DatabaseIOException;

    .line 163
    .line 164
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    throw p1
.end method

.method public j()V
    .locals 6

    .line 1
    const-string v0, "DROP TABLE IF EXISTS "

    .line 2
    .line 3
    const-string v1, "ExoPlayerCacheIndex"

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ldefpackage/tk4;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_1

    .line 25
    .line 26
    .line 27
    :try_start_1
    sget v3, Ldefpackage/r45;->a:I

    .line 28
    .line 29
    const-string v3, "ExoPlayerVersions"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    :try_start_2
    invoke-static {v2, v3}, Ldefpackage/f35;->f0(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v4, "feature = ? AND instance_uid = ?"

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    filled-new-array {v5, p0}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v2, v3, v4, p0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    .line 51
    .line 52
    :goto_0
    :try_start_3
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v2, p0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 60
    .line 61
    .line 62
    :try_start_4
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_1

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_1

    .line 68
    :catch_0
    move-exception p0

    .line 69
    :try_start_5
    new-instance v0, Landroidx/media3/database/DatabaseIOException;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 75
    :goto_1
    :try_start_6
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 76
    .line 77
    .line 78
    throw p0
    :try_end_6
    .catch Landroid/database/SQLException; {:try_start_6 .. :try_end_6} :catch_1

    .line 79
    :catch_1
    move-exception p0

    .line 80
    new-instance v0, Landroidx/media3/database/DatabaseIOException;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v0
.end method

.method public k(JLdefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;
    .locals 14

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ce;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Ldefpackage/ce;->c()Ldefpackage/ce;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ldefpackage/ce;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "valueVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Ldefpackage/ce;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ldefpackage/ce;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Ldefpackage/de;

    .line 38
    .line 39
    invoke-interface {v5, v3}, Ldefpackage/de;->get(I)Ldefpackage/c81;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Ldefpackage/ce;->a(I)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    move-object/from16 v12, p4

    .line 50
    .line 51
    invoke-virtual {v12, v3}, Ldefpackage/ce;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    invoke-virtual {v13, v3}, Ldefpackage/ce;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    move-wide v7, p1

    .line 62
    invoke-interface/range {v6 .. v11}, Ldefpackage/c81;->e(JFFF)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v4, v3, v6}, Ldefpackage/ce;->d(IF)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public l(Ldefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)Ldefpackage/ce;
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ce;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Ldefpackage/ce;->c()Ldefpackage/ce;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ldefpackage/ce;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "endVelocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Ldefpackage/ce;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ldefpackage/ce;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Ldefpackage/de;

    .line 38
    .line 39
    invoke-interface {v5, v3}, Ldefpackage/de;->get(I)Ldefpackage/c81;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {p1, v3}, Ldefpackage/ce;->a(I)F

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {p2, v3}, Ldefpackage/ce;->a(I)F

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-virtual {p3, v3}, Ldefpackage/ce;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-interface {v5, v6, v7, v8}, Ldefpackage/c81;->d(FFF)F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v4, v3, v5}, Ldefpackage/ce;->d(IF)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_2
    if-eqz v4, :cond_3

    .line 70
    .line 71
    return-object v4

    .line 72
    :cond_3
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_4
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method

.method public m(Ldefpackage/ce;Ldefpackage/ce;Ldefpackage/ce;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Ldefpackage/ce;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_0

    .line 9
    .line 10
    iget-object v4, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Ldefpackage/de;

    .line 13
    .line 14
    invoke-interface {v4, v3}, Ldefpackage/de;->get(I)Ldefpackage/c81;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {p1, v3}, Ldefpackage/ce;->a(I)F

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual {p2, v3}, Ldefpackage/ce;->a(I)F

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-virtual {p3, v3}, Ldefpackage/ce;->a(I)F

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-interface {v4, v5, v6, v7}, Ldefpackage/c81;->c(FFF)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-wide v1
.end method

.method public n(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    check-cast v2, Landroid/content/IntentFilter;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object v3, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-void

    .line 41
    :cond_2
    const-string p0, "filters must not be null"

    .line 42
    .line 43
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public o(Ldefpackage/kc1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object p0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const/4 p0, 0x1

    .line 25
    iput-boolean p0, p1, Ldefpackage/kc1;->x:Z

    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p0

    .line 31
    :cond_0
    const-string p0, "Fragment already added: "

    .line 32
    .line 33
    invoke-static {p1, p0}, Ldefpackage/er1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public p(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string p0, "groupMemberId must not be empty"

    .line 43
    .line 44
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public q(Landroid/database/sqlite/SQLiteDatabase;Ldefpackage/wx;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p2, Ldefpackage/wx;->e:Ldefpackage/yj0;

    .line 7
    .line 8
    new-instance v2, Ljava/io/DataOutputStream;

    .line 9
    .line 10
    invoke-direct {v2, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Ldefpackage/ml3;->g(Ldefpackage/yj0;Ljava/io/DataOutputStream;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Landroid/content/ContentValues;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 23
    .line 24
    .line 25
    iget v2, p2, Ldefpackage/wx;->a:I

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "id"

    .line 32
    .line 33
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 34
    .line 35
    .line 36
    const-string v2, "key"

    .line 37
    .line 38
    iget-object p2, p2, Ldefpackage/wx;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string p2, "metadata"

    .line 44
    .line 45
    invoke-virtual {v1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    invoke-virtual {p1, p0, p2, v1}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public r()Ldefpackage/sp2;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Bundle;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v2, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "controlFilters"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v2, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    const-string v2, "groupMemberIds"

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    const-string p0, "allowedPackages"

    .line 43
    .line 44
    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Ldefpackage/sp2;

    .line 48
    .line 49
    invoke-direct {p0, v0}, Ldefpackage/sp2;-><init>(Landroid/os/Bundle;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public s(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    .line 1
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ldefpackage/yd4;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p0, v3, p2, p3}, Ldefpackage/ss0;->s(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    const-string p0, "This graph contains cyclic dependencies"

    .line 54
    .line 55
    invoke-static {p0}, Ldefpackage/tb4;->e(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public t(Ljava/lang/String;)Ldefpackage/kc1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ldefpackage/fe1;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/fe1;->c:Ldefpackage/kc1;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public u(Ljava/lang/String;)Ldefpackage/kc1;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ldefpackage/fe1;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Ldefpackage/fe1;->c:Ldefpackage/kc1;

    .line 28
    .line 29
    iget-object v1, v0, Ldefpackage/kc1;->r:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v0, v0, Ldefpackage/kc1;->H:Ldefpackage/md1;

    .line 39
    .line 40
    iget-object v0, v0, Ldefpackage/ld1;->c:Ldefpackage/ss0;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ldefpackage/ss0;->u(Ljava/lang/String;)Ldefpackage/kc1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    if-eqz v0, :cond_0

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public v()Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ldefpackage/fe1;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method

.method public w()Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ldefpackage/fe1;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v1, v1, Ldefpackage/fe1;->c:Ldefpackage/kc1;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p0
.end method

.method public y()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    move-wide v3, v1

    .line 16
    :goto_0
    const-wide v1, 0x4076800000000000L    # 360.0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmpg-double v1, v3, v1

    .line 22
    .line 23
    if-gtz v1, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ldefpackage/ol1;

    .line 28
    .line 29
    iget-wide v5, v1, Ldefpackage/ol1;->b:D

    .line 30
    .line 31
    iget-wide v7, v1, Ldefpackage/ol1;->c:D

    .line 32
    .line 33
    invoke-static/range {v3 .. v8}, Ldefpackage/ol1;->a(DDD)Ldefpackage/ol1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 41
    .line 42
    add-double/2addr v3, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 49
    .line 50
    return-object v0
.end method

.method public z()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/ss0;->y()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ldefpackage/ol1;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v1, Ldefpackage/t8;

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-direct {v1, v2, p0}, Ldefpackage/t8;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Ldefpackage/n7;

    .line 31
    .line 32
    const/16 v3, 0x16

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ldefpackage/n7;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 45
    .line 46
    return-object v0
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
