.class public final Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8

.field private static COMPLETED:Ljava/lang/String; = "completed"

.field public static final Companion:Ldefpackage/in3;

.field private static DELETED:Ljava/lang/String; = "deleted"

.field private static DOWNLOADING:Ljava/lang/String; = "downloading"

.field private static ERROR:Ljava/lang/String; = "error"

.field private static NEW:Ljava/lang/String; = "new"

.field private static SKIPPED:Ljava/lang/String; = "skipped"


# instance fields
.field private value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/in3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->Companion:Ldefpackage/in3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getCOMPLETED$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->COMPLETED:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDELETED$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->DELETED:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDOWNLOADING$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->DOWNLOADING:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getERROR$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->ERROR:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getNEW$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->NEW:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSKIPPED$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->SKIPPED:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setCOMPLETED$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->COMPLETED:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setDELETED$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->DELETED:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setDOWNLOADING$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->DOWNLOADING:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setERROR$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->ERROR:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setNEW$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->NEW:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setSKIPPED$cp(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->SKIPPED:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastStatus;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
