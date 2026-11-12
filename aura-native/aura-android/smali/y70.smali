.class public final Ly70;
.super Lwd0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Ljava/lang/Object;

.field public o:Lk02;

.field public p:I

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La80;

.field public t:I


# direct methods
.method public constructor <init>(La80;Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly70;->s:La80;

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
    iput-object p1, p0, Ly70;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ly70;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ly70;->t:I

    .line 9
    .line 10
    iget-object p1, p0, Ly70;->s:La80;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, v0, p0}, La80;->a(La80;Landroid/view/ScrollCaptureSession;Lk02;Lwd0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
