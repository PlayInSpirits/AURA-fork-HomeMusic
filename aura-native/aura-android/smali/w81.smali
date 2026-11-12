.class public final Lw81;
.super Lwd0;


# instance fields
.field public synthetic n:Ljava/lang/Object;

.field public o:I

.field public final synthetic p:Lx81;

.field public q:Lx81;

.field public r:Lq81;

.field public s:Ljava/lang/Throwable;

.field public t:J


# direct methods
.method public constructor <init>(Lx81;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw81;->p:Lx81;

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
    iput-object p1, p0, Lw81;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lw81;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lw81;->o:I

    .line 9
    .line 10
    iget-object p1, p0, Lw81;->p:Lx81;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lx81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
