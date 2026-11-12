.class public final Lx14;
.super Lu22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lcz;


# direct methods
.method public constructor <init>(Lcz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzd2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx14;->u:Lcz;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final s(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lx14;->u:Lcz;

    .line 2
    .line 3
    sget-object p1, Lj15;->a:Lj15;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
