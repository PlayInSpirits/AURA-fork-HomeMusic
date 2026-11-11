.class public final Lh15;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public synthetic o:Z

.field public final synthetic p:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh15;->p:Landroid/content/Context;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lep4;-><init>(ILvd0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 1

    .line 1
    new-instance v0, Lh15;

    .line 2
    .line 3
    iget-object p0, p0, Lh15;->p:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lh15;-><init>(Landroid/content/Context;Lvd0;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    iput-boolean p0, v0, Lh15;->o:Z

    .line 15
    .line 16
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    check-cast p2, Lvd0;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lh15;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lh15;

    .line 13
    .line 14
    sget-object p1, Lj15;->a:Lj15;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lh15;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lh15;->o:Z

    .line 5
    .line 6
    iget-object p0, p0, Lh15;->p:Landroid/content/Context;

    .line 7
    .line 8
    const-class v0, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 9
    .line 10
    invoke-static {p0, v0, p1}, Lyb3;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lj15;->a:Lj15;

    .line 14
    .line 15
    return-object p0
.end method
