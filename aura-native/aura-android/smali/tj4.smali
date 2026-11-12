.class public final Ltj4;
.super Lpz1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final p:Lfe0;


# direct methods
.method public constructor <init>(Ldf;)V
    .locals 1

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lfe0;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lfe0;-><init>(Ltj4;Ldf;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ltj4;->p:Lfe0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 5

    .line 1
    iget-object v0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldf;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v2, Landroid/util/TypedValue;

    .line 13
    .line 14
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 15
    .line 16
    .line 17
    const v3, 0x7f040403

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-virtual {v1, v3, v2, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget v1, v2, Landroid/util/TypedValue;->resourceId:I

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ldf;->setTheme(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    iget-object p0, p0, Ltj4;->p:Lfe0;

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
