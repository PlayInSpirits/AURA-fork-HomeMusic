.class public final Lyv;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Law;

.field public p:I


# direct methods
.method public constructor <init>(Law;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyv;->o:Law;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lwd0;-><init>(Lvd0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lyv;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyv;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyv;->p:I

    .line 9
    .line 10
    iget-object p1, p0, Lyv;->o:Law;

    .line 11
    .line 12
    invoke-static {p1, p0}, Law;->I(Law;Lwd0;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lxe0;->n:Lxe0;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance p1, Lj10;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lj10;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method
