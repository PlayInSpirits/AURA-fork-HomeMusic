.class public final Ly64;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:J


# direct methods
.method public constructor <init>(JLvd0;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ly64;->p:J

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p3}, Lep4;-><init>(ILvd0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 3

    .line 1
    new-instance v0, Ly64;

    .line 2
    .line 3
    iget-wide v1, p0, Ly64;->p:J

    .line 4
    .line 5
    invoke-direct {v0, v1, v2, p2}, Ly64;-><init>(JLvd0;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Ly64;->o:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Le74;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ly64;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ly64;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ly64;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ly64;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Le74;

    .line 7
    .line 8
    iget-object p1, p1, Le74;->a:Lg74;

    .line 9
    .line 10
    iget-object v0, p1, Lg74;->k:Lq64;

    .line 11
    .line 12
    iget-wide v1, p0, Ly64;->p:J

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    invoke-virtual {p1, v0, v1, v2, p0}, Lg74;->d(Lq64;JI)J

    .line 16
    .line 17
    .line 18
    sget-object p0, Lj15;->a:Lj15;

    .line 19
    .line 20
    return-object p0
.end method
