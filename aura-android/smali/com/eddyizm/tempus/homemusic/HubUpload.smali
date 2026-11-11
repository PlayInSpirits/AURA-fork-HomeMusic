.class public final Lcom/eddyizm/tempus/homemusic/HubUpload;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private id:J

.field private origName:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "orig_name"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/homemusic/HubUpload;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getOrigName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubUpload;->origName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/eddyizm/tempus/homemusic/HubUpload;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setOrigName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubUpload;->origName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
