.class public final Lbd4;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Lcd4;

.field public o:Lq81;

.field public p:Ldd4;

.field public q:Ls22;

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lcd4;

.field public t:I


# direct methods
.method public constructor <init>(Lcd4;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbd4;->s:Lcd4;

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
    iput-object p1, p0, Lbd4;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lbd4;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lbd4;->t:I

    .line 9
    .line 10
    iget-object p1, p0, Lbd4;->s:Lcd4;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lcd4;->k(Lcd4;Lq81;Lvd0;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lxe0;->n:Lxe0;

    .line 17
    .line 18
    return-object p0
.end method
