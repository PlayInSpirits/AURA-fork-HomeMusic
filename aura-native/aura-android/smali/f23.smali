.class public final Lf23;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Lfx3;

.field public final synthetic o:Lfx3;

.field public final synthetic p:Lv23;

.field public final synthetic q:Z

.field public final synthetic r:Lii;


# direct methods
.method public constructor <init>(Lfx3;Lfx3;Lv23;ZLii;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf23;->n:Lfx3;

    .line 2
    .line 3
    iput-object p2, p0, Lf23;->o:Lfx3;

    .line 4
    .line 5
    iput-object p3, p0, Lf23;->p:Lv23;

    .line 6
    .line 7
    iput-boolean p4, p0, Lf23;->q:Z

    .line 8
    .line 9
    iput-object p5, p0, Lf23;->r:Lii;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La23;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf23;->n:Lfx3;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lfx3;->n:Z

    .line 10
    .line 11
    iget-object v0, p0, Lf23;->o:Lfx3;

    .line 12
    .line 13
    iput-boolean v1, v0, Lfx3;->n:Z

    .line 14
    .line 15
    iget-boolean v0, p0, Lf23;->q:Z

    .line 16
    .line 17
    iget-object v1, p0, Lf23;->r:Lii;

    .line 18
    .line 19
    iget-object p0, p0, Lf23;->p:Lv23;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0, v1}, Lv23;->r(La23;ZLii;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lj15;->a:Lj15;

    .line 25
    .line 26
    return-object p0
.end method
