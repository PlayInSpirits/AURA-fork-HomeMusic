.class public final Lis1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Liq4;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lis1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lis1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final d(Lkq4;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Lkq4;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(Lkq4;)V
    .locals 0

    .line 1
    iget p0, p0, Lis1;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lkq4;)V
    .locals 1

    .line 1
    iget v0, p0, Lis1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lis1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->p0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 20
    .line 21
    iget p1, p1, Lkq4;->b:I

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lfs1;

    .line 28
    .line 29
    iget-object p1, p1, Lfs1;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->i0(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lkq4;)V
    .locals 1

    .line 1
    iget v0, p0, Lis1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lis1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    iget p1, p1, Lkq4;->b:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->c(IZ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 21
    .line 22
    iget-boolean v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->p0:Z

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget p1, p1, Lkq4;->b:I

    .line 28
    .line 29
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->z0:[Ljava/lang/String;

    .line 30
    .line 31
    aget-object v0, v0, p1

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lfs1;

    .line 42
    .line 43
    iget-object v0, p1, Lfs1;->b:Ljava/lang/String;

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/homemusic/HubFragment;->i0(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
