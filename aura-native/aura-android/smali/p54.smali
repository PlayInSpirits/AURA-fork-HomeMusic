.class public final Lp54;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# static fields
.field public static final o:Lp54;

.field public static final p:Lp54;


# instance fields
.field public final synthetic n:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp54;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lp54;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp54;->o:Lp54;

    .line 8
    .line 9
    new-instance v0, Lp54;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lp54;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lp54;->p:Lp54;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp54;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Lp54;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw2;

    .line 7
    .line 8
    check-cast p2, Lw2;

    .line 9
    .line 10
    new-instance p0, Lw2;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p1, Lw2;->a:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    iget-object v0, p2, Lw2;->a:Ljava/lang/String;

    .line 19
    .line 20
    :cond_1
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p1, Lw2;->b:Lsf1;

    .line 23
    .line 24
    if-nez p1, :cond_3

    .line 25
    .line 26
    :cond_2
    iget-object p1, p2, Lw2;->b:Lsf1;

    .line 27
    .line 28
    :cond_3
    invoke-direct {p0, v0, p1}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    check-cast p1, Lt44;

    .line 33
    .line 34
    check-cast p2, Lx40;

    .line 35
    .line 36
    iget-wide p0, p2, Lx40;->a:J

    .line 37
    .line 38
    const-wide/16 v0, 0x10

    .line 39
    .line 40
    cmp-long p2, p0, v0

    .line 41
    .line 42
    if-nez p2, :cond_4

    .line 43
    .line 44
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    invoke-static {p0, p1}, Le35;->U(J)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :goto_0
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
