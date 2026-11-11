.class public final Llk4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvd0;
.implements Lye0;


# instance fields
.field public final n:Lvd0;

.field public final o:Lne0;


# direct methods
.method public constructor <init>(Lvd0;Lne0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llk4;->n:Lvd0;

    .line 5
    .line 6
    iput-object p2, p0, Llk4;->o:Lne0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCallerFrame()Lye0;
    .locals 1

    .line 1
    iget-object p0, p0, Llk4;->n:Lvd0;

    .line 2
    .line 3
    instance-of v0, p0, Lye0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lye0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final getContext()Lne0;
    .locals 0

    .line 1
    iget-object p0, p0, Llk4;->o:Lne0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llk4;->n:Lvd0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lvd0;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
