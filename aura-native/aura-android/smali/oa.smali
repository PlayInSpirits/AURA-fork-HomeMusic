.class public final synthetic Loa;
.super Lig1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxf1;


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    check-cast p2, Lqf4;

    .line 5
    .line 6
    iget-wide p1, p2, Lqf4;->a:J

    .line 7
    .line 8
    check-cast p3, Lif1;

    .line 9
    .line 10
    iget-object p0, p0, Ljy;->receiver:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lra;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget v1, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 33
    .line 34
    new-instance v3, Lro0;

    .line 35
    .line 36
    invoke-direct {v3, v2, v1}, Lro0;-><init>(FF)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lt70;

    .line 40
    .line 41
    invoke-direct {v1, v3, p1, p2, p3}, Lt70;-><init>(Lro0;JLif1;)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lbb;->a:Lbb;

    .line 45
    .line 46
    invoke-virtual {p1, p0, v0, v1}, Lbb;->a(Landroid/view/View;Lqu0;Lt70;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_0
    invoke-static {}, Lkf2;->k()V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method
