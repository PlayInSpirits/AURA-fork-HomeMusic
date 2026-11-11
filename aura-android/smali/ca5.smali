.class public final Lca5;
.super Lzg0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic A:Ljava/lang/String;

.field public final synthetic q:Landroid/content/Context;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Z

.field public final synthetic v:Lge2;

.field public final synthetic w:Z

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLge2;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lca5;->q:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lca5;->r:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lca5;->s:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lca5;->t:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p5, p0, Lca5;->u:Z

    .line 10
    .line 11
    iput-object p6, p0, Lca5;->v:Lge2;

    .line 12
    .line 13
    iput-boolean p7, p0, Lca5;->w:Z

    .line 14
    .line 15
    iput p8, p0, Lca5;->x:I

    .line 16
    .line 17
    iput-object p9, p0, Lca5;->y:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p10, p0, Lca5;->z:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p11, p0, Lca5;->A:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {p0}, Lzg0;-><init>()V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Lcx4;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iget-object v1, v0, Lca5;->q:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 10
    .line 11
    .line 12
    move-result-object v13

    .line 13
    new-instance v2, Landroid/content/ComponentName;

    .line 14
    .line 15
    const-class v3, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;

    .line 16
    .line 17
    invoke-direct {v2, v1, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v13, v2}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 21
    .line 22
    .line 23
    move-result-object v14

    .line 24
    array-length v15, v14

    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    if-ge v1, v15, :cond_0

    .line 27
    .line 28
    aget v8, v14, v1

    .line 29
    .line 30
    iget-object v2, v0, Lca5;->v:Lge2;

    .line 31
    .line 32
    iget-object v7, v2, Lge2;->a:Ljava/lang/String;

    .line 33
    .line 34
    move v12, v8

    .line 35
    iget-object v8, v2, Lge2;->b:Ljava/lang/String;

    .line 36
    .line 37
    iget v9, v2, Lge2;->c:I

    .line 38
    .line 39
    iget-boolean v10, v0, Lca5;->w:Z

    .line 40
    .line 41
    iget v11, v0, Lca5;->x:I

    .line 42
    .line 43
    move v2, v1

    .line 44
    iget-object v1, v0, Lca5;->q:Landroid/content/Context;

    .line 45
    .line 46
    move v3, v2

    .line 47
    iget-object v2, v0, Lca5;->r:Ljava/lang/String;

    .line 48
    .line 49
    move v4, v3

    .line 50
    iget-object v3, v0, Lca5;->s:Ljava/lang/String;

    .line 51
    .line 52
    move v6, v4

    .line 53
    iget-object v4, v0, Lca5;->t:Ljava/lang/String;

    .line 54
    .line 55
    move/from16 v16, v6

    .line 56
    .line 57
    iget-boolean v6, v0, Lca5;->u:Z

    .line 58
    .line 59
    invoke-static/range {v1 .. v12}, Lji2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Ljava/lang/String;IZII)Landroid/widget/RemoteViews;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    iget-object v10, v0, Lca5;->z:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v11, v0, Lca5;->A:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v6, v0, Lca5;->q:Landroid/content/Context;

    .line 68
    .line 69
    iget-object v9, v0, Lca5;->y:Ljava/lang/String;

    .line 70
    .line 71
    move v8, v12

    .line 72
    invoke-static/range {v6 .. v11}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->a(Landroid/content/Context;Landroid/widget/RemoteViews;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v13, v12, v7}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v1, v16, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    return-void
.end method

.method public final m(Landroid/graphics/drawable/Drawable;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lca5;->q:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Landroid/content/ComponentName;

    .line 10
    .line 11
    const-class v4, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;

    .line 12
    .line 13
    invoke-direct {v3, v1, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    array-length v3, v1

    .line 21
    const/4 v4, 0x0

    .line 22
    :goto_0
    if-ge v4, v3, :cond_0

    .line 23
    .line 24
    aget v16, v1, v4

    .line 25
    .line 26
    iget-object v5, v0, Lca5;->v:Lge2;

    .line 27
    .line 28
    iget-object v11, v5, Lge2;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v12, v5, Lge2;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget v13, v5, Lge2;->c:I

    .line 33
    .line 34
    iget-boolean v14, v0, Lca5;->w:Z

    .line 35
    .line 36
    iget v15, v0, Lca5;->x:I

    .line 37
    .line 38
    iget-object v5, v0, Lca5;->q:Landroid/content/Context;

    .line 39
    .line 40
    iget-object v6, v0, Lca5;->r:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v7, v0, Lca5;->s:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v8, v0, Lca5;->t:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    iget-boolean v10, v0, Lca5;->u:Z

    .line 48
    .line 49
    invoke-static/range {v5 .. v16}, Lji2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;Ljava/lang/String;IZII)Landroid/widget/RemoteViews;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    iget-object v9, v0, Lca5;->z:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v10, v0, Lca5;->A:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v5, v0, Lca5;->q:Landroid/content/Context;

    .line 58
    .line 59
    iget-object v8, v0, Lca5;->y:Ljava/lang/String;

    .line 60
    .line 61
    move/from16 v7, v16

    .line 62
    .line 63
    invoke-static/range {v5 .. v10}, Lcom/eddyizm/tempus/widget/WidgetProvider4x1;->a(Landroid/content/Context;Landroid/widget/RemoteViews;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v7, v6}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    return-void
.end method
